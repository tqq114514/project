package socketPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/*单线程聊天服务端*/
public class Server {
    private ServerSocket serverSocket;
    public Server(){
        try {
            System.out.println("启动服务端：");
            serverSocket =new ServerSocket(9999);
            System.out.println("服务端启动完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void start(){
        try {
            System.out.println("等待客户端连接：");
            Socket socket =  serverSocket.accept();
            System.out.println("已建立一个连接！");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String message;
            while ((message = br.readLine())!=null){
                System.out.println("发过来的聊天内容是："+message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}


