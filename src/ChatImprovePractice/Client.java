package ChatImprovePractice;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*多线程聊天客户端，连接客户端发送消息*/
public class Client {

    private Socket socket;
    public Client(){
        try {
            System.out.println("初始化客户端");
             socket = new Socket("127.0.0.1",9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void Start(){
        try {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入聊天内容：");
            while (true){
                String s = scanner.nextLine();
                if("exit".equals(s)){
                    break;
                }
                pw.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();  /*流用完要关，切记*/
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
        client.Start();
    }
}
