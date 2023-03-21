package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/*多线程版本，利用多线程完成与客户端交互，使得主线程只负责接受连接
在server中定义内部类ClientHandler来实现Runnable接口，作为线程任务

/**
 * 聊天室的服务端 版本3
 *
 * 这个版本我们实现将消息发送给客户端
 *
 * 目前先实现将客户端发送过来的消息回复给该客户端
 * 具体做法:
 * 1:每个ClientHandler中,我们通过socket获取输出流,并进行流连接为PrintWriter
 * 2:每当我们读取到来自客户端发送过来的一行字符串后,就将它通过PrintWriter再发送回给该客户端
 * 通过这个测试,实现服务端给客户端发送消息的操作
 *
 */

public class Server5 {
    private ServerSocket serverSocket;
    /*该集合用于保存所有客户端的输出流，并广播信息*/
    private ArrayList<PrintWriter> allOut = new ArrayList<>();
    public Server5(){
        try {
                System.out.println("启动服务端");
                serverSocket = new ServerSocket(23333);
                System.out.println("服务端启动完毕");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        System.out.println("等待客户端连接");
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("已建立一个连接");
                /*启动一个线程与客户端交互*/
                Runnable ra = new ClientHandler(socket);
                Thread thread = new Thread(ra);
                thread.start();
            }
            } catch(IOException e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        Server5 server = new Server5();
        server.start();
    }
    private  class ClientHandler implements Runnable{

        private final Socket socket;
        private final String host; //记录已连接客户端的IP地址
        public ClientHandler(Socket socket) {
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }
        /*与客户端交互的线程任务*/
        @Override
        public void run() {
              PrintWriter pw = null;  //由于作用域的问题，我们在finally里调用不到pw,需要在外面声明
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                /*通过socket获取输出流用于给客户端发送消息*/
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);

                /*将对应该客户端的输出流存入共享集合allOut中，便于其他线程可以访问到*/
                synchronized (allOut){
                    allOut.add(pw);   //给allOut加锁，以防止线程抢占写入printWriter，导致数据异常
                }
                sendMessage(host+"上线了，当前聊天室在线人数为："+allOut.size());

                String message;
                while ((message = br.readLine()) != null) {
                   sendMessage(host + "说：" + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                /*收尾工作，客户端下线操作*/
                /*首先将该离线客户端的输出流在这个集合里面删掉*/
                synchronized (allOut) {
                    allOut.remove(pw);
                }
                /*广播这个人下线了*/
                sendMessage(host+"下线了，当前在线人数："+allOut.size());
                /*关闭socket,释放资源*/
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /*v5功能：实现广播消息的方法：
        * 将消息转发给所有客户端
        * */
        private void sendMessage(String message){
            System.out.println(host+ "客户端发到服务端的消息为：" + message);
            /*遍历allOut,给所有客户端发消息*/
            /*新循环是迭代器，迭代器要求遍历过程中不能用集合方法增删元素，所以需要和上面的增删互斥*/
            synchronized(allOut){
                for(PrintWriter out :allOut){
                    out.println(message);
                }
            }
        }
    }
}
