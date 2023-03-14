package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client3 {
    private Socket socket;
    public Client3(){
        try {
            System.out.println("正在连接服务器");
            socket = new Socket("176.17.9.23",8088);
           /* socket = new Socket("localhost",23333);*/
            /*socket = new Socket("176.17.9.44",8088);*/
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

            /*暂时接受服务端返回的消息，临时*/
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is,StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("请按行输入要传输的消息：");
            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
                /*给服务端发送内容的同时，接受服务端发送的内容，临时*/
                line = br.readLine();
                System.out.println(line);
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
        Client3 client = new Client3();
        client.start();
    }
}
