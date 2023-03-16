package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/**
 * 聊天室的客户端
 *
 * V3版的客户端start方法中的主要逻辑是先等待用户在控制台上输入一行字符串,然后将其发送给服务端后再读取
 * 来自服务端发送过来的消息.
 * 但是由于V4服务器已经改成了可以将其他客户端的消息也转发给所有有客户端的操作,这会导致有源源不断的新消息
 * 发送给客户端,然后如果客户端必须先等待用户输入一行再接收一行来自服务端消息的话,会导致接收消息不畅问题.
 *
 * 为了解决这个问题:
 * 我们应当将发送消息和接收消息的操作分别在不同的线程上运行,才能做到互不干涉.
 *
 * 实现:
 * 我们将发送消息还定义在start方法中由客户端的主线程执行即可,将读取消息单独定义到一个线程上执行
 * 1:定义内部类ServerHandler,这是一个线程任务,主要工作就是读取来自服务端发送的消息并输出到客户端的
 *   控制台上
 * 2:在start方法一开始就启动一个线程来执行ServerHandler这个任务,不断接收来自服务端的消息.
 *
 *
 *
 */
public class Client4 {
    private Socket socket;
    public Client4(){
        try {
            System.out.println("正在连接服务器");
            socket = new Socket("176.17.9.23",8088);
            /*socket = new Socket("localhost",23333);*/
            /*socket = new Socket("176.17.9.44",8088);*/
            System.out.println("与服务器连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void start(){
        try {
            /*启动用于接受服务器消息的线程*/
            ServerHandler sh = new ServerHandler();
            Thread thread = new Thread(sh);
            thread.start();

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            System.out.println("请按行输入要传输的消息：");
            Scanner scanner = new Scanner(System.in);
            while (true){
                String line = scanner.nextLine();
                if("exit".equals(line)){
                    break;
                }
                pw.println(line);
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
        Client4 client = new Client4();
        client.start();

    }
    private class ServerHandler implements Runnable{
        /*该线程负责不断接受服务端转发来的信息*/
        @Override
        public void run() {
            /*暂时接受服务端返回的消息，临时*/
            try {
                InputStream is = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(is,StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                /*给服务端发送内容的同时，接受服务端发送的内容，临时*/
                String line;
                while ((line = br.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
