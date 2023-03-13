package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //printwriter必须按行写，一起写是不会刷新的，按行刷新
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        //转换流
        OutputStreamWriter osw =new  OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲流
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容，输入exit退出：");
        while (true){
            String line = scanner.nextLine();
            if("exit".equals(line)){
                break;
            }
            pw.println(line);
            pw.flush();
        }
        System.out.println("写好了");
        pw.close();
    }
}
