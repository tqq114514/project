package exception2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PrintWriter1 {
    public static void main(String[] args) throws FileNotFoundException {
        /*1、文件流：将字节写入文件中
        * 2、利用转换流将字符转换为字节输出
        * 3、缓冲字符流，块文本数据加速(内部缓冲区默认8192个char）
        * 4、printWriter：行刷出自动刷新，按行输出字符串*/
        FileOutputStream fis = new FileOutputStream("hello.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fis, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        Scanner scanner =new Scanner(System.in);
        System.out.println("请开始输入数据输入exit退出：");
        while (true){
            String line = scanner.nextLine();
            if ("exit".equals(line)){
                break;
            }
            pw.println(line);
        }
        pw.close();

    }
}
