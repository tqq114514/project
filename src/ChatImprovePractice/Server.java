package ChatImprovePractice;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*多线程聊天服务端，完成多人连接聊天*/
public class Server {
    /*利用构造方法启动服务端*/
    private ServerSocket ss;
    private ArrayList<PrintWriter> allList = new ArrayList<>();
    public Server() {
        try {
            System.out.println("初始化聊天室");
            ss = new ServerSocket(9999);
            System.out.println("聊天室已就位");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*接受客户端连接*/
    public void Start() {
        try {
            while (true) {
                Socket socket = ss.accept();
                System.out.println("一个客户端已连接");
                /*启动一个线程与客户端交互*/
                Runnable runnable = new ClientHandler(socket);
                Thread thread = new Thread(runnable);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.Start();

    }

    /*在多线程中处理多客户端连接和接受信息的功能,
     * 建立ClientHandler专门用于处理线程及接受聊天内容
     * 写成Server的内部类*/
     private class ClientHandler implements Runnable {

        private  Socket socket;
        private  String host;

        /*利用构造方法的时机，将参数传递过来，并将值赋给私有成员变量保存*/
        public  ClientHandler(Socket socket) {
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
            /*System.out.println(socket.getInetAddress());*/
        }
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                /*将客户端发过来的流分发到其他客户端*/
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os,StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw,true);
                /*把客户端发来的流全部装到arraylist集合里*/
                allList.add(pw);

                String message;
                while ((message = br.readLine())!=null){
                    System.out.println(host +"发过来的数据为"+message);
                    /*遍历allList集合，输出里面所有的流*/
                    for (PrintWriter stream : allList){
                        stream.println(host +"广播的数据为"+message);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
