package io2;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./114514.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./11451419.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start =System.currentTimeMillis();
        int len;
        while ((len = bis.read())!= -1){
            bos.write(len);
        }
        long end = System.currentTimeMillis();
        System.out.println("写好了,用时："+(end-start)+"ms");
        bis.close();
        bos.close();
    }
}
