package socketPractice;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*单线程聊天客户端*/
public class Client {
    private Socket socket;
    public  Client(){
        try {
            System.out.println("正在连接服务器");
            socket = new Socket("127.0.0.1",9999);
            System.out.println("成功与服务器建立连接");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void start(){
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请按行输入你要发送的聊天内容：");
            while (true){
                String s = scanner.nextLine();
                pw.println(s);
                if ("exit".equals(s)){
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
