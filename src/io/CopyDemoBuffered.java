package io;

import java.io.*;
/*单字节拷贝图片*/
/*缓冲流：加快读写效率,建立在低级流之上
* 1、BufferedInputStream
* BufferedOutputStream
* 缓冲流内部有一个8kb的字节数组，缓冲流底层为我们做了块读写*/
public class CopyDemoBuffered {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("note.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("note1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long strat = System.currentTimeMillis();
        int len ;
        while ((len = bis.read())!=-1){  //缓冲流读数据
            bos.write(len);  //缓冲流写数据
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕，用时："+(end-strat)+"ms");
        fis.close();  //只需要关高级流，高级流中已经关了低级流
        fos.close();
    }
}
