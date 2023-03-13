package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
* 缓冲字符流----最常用的读写字符串的流
* 是一对高级流，并且是字符流
* 内部维护了一组8字节的char[]数组，还是以块读写字符形式提高读写速度*/
public class PWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./pw.txt");  //文件流，低级流，用于读写文件内容
        //转换流，字符转字节
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //缓冲字符流，提高字符读写效率
        BufferedWriter bw = new BufferedWriter(osw);
        //关最底层的流就可以了，为了换行输出
        PrintWriter pw = new PrintWriter(bw,true);
        pw.println("和我在城都的街头走一走");
        pw.println("直到所有的灯都熄灭了也不停留");
        System.out.println("写好了");
        pw.close();

        /*简化版本*/
       /* PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("和我在成都的街头走一走1");
        pw.println("直到所有的灯都熄灭了也不停留2");
        System.out.println("写出完毕");
        pw.close();*/
    }
}
