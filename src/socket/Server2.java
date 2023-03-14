package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*多线程版本，利用多线程完成与客户端交互，使得主线程只负责接受连接
在server中定义内部类ClientHandler来实现Runnable接口，作为线程任务

* */

public class Server2 {
    private ServerSocket serverSocket;
    public Server2(){
        try {
                System.out.println("启动服务端");
                serverSocket = new ServerSocket(23333);
                System.out.println("服务端启动完毕");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){

        try {
            while (true) {
                System.out.println("等待客户端连接");
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
        Server2 server = new Server2();
        server.start();
    }
    private static class ClientHandler implements Runnable{

        private final Socket socket;
        private String host; //记录已连接客户端的IP地址
        public ClientHandler(Socket socket) {
            this.socket = socket;
            host = socket.getInetAddress().getHostAddress();
        }
        /*与客户端交互的线程任务*/
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String message;
                while ((message = br.readLine()) != null) {
                    System.out.println(host+ "发送的消息为：" + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
