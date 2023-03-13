package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    private Socket socket;
    public Client(){
        try {
            System.out.println("正在连接服务器");
           /* socket = new Socket("176.17.9.44",8088);*/
            socket = new Socket("localhost",23333);
            System.out.println("与服务器连接成功");
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
            System.out.println("请按行输入要传输的消息：");
            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                pw.println(line);
                if("exit".equals(line)){
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
