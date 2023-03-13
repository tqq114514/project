package io2;

import java.io.*;

/*单字节文件拷贝*/
public class SingleByteFileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("p.jpg");
        FileOutputStream outputStream = new FileOutputStream("pwork.jpg");
        long start = System.currentTimeMillis();
        /*记录每次读取到的字节，知道读到-1，文件读取完毕，不再复制*/
        int getByte ;
        while ((getByte = inputStream.read())!=-1){
            outputStream.write(getByte);
        }
        long end = System.currentTimeMillis();
        System.out.println("单字节文件拷贝完成,用时:"+(end-start)+"ms");

        inputStream.close();
        outputStream.close();



    }
}
