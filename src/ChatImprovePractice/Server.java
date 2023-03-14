package ChatImprovePractice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*多线程聊天服务端，完成多人连接聊天*/
public class Server {
    /*利用构造方法启动服务端*/
    private ServerSocket ss;
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
    static class ClientHandler implements Runnable {

        private final Socket socket;
        private String host;

        /*利用构造方法的时机，将参数传递过来，并将值赋给私有成员变量保存*/
        public  ClientHandler(Socket socket) {
            this.socket = socket;
            String host = socket.getInetAddress().getHostAddress();
        }
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                String message;
                while ((message = br.readLine())!=null){
                    System.out.println(host+"发过来的数据为"+message);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
