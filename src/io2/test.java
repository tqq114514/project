package io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class test {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("./p.jpg");
        FileOutputStream outputStream = new FileOutputStream("./p23.jpg");
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[20*1024]; //20kb
        int length; //记录每次读取到的字节数
        while ((length = inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,length);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制用时："+(end-start)+"ms");
        inputStream.close();
        outputStream.close();
    }
}
