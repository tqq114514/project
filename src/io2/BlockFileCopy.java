package io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*块读写的文件复制*/
public class BlockFileCopy{
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("p.jpg");
        FileOutputStream outputStream = new FileOutputStream("pblock.jpg");
        long start = System.currentTimeMillis();
        /*记录每次读取到的字节，知道读到-1，文件读取完毕，不再复制*/
        byte[] bytes = new byte[10*1024];
        int getByte ;
        while ((getByte = inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,getByte);
        }
        long end = System.currentTimeMillis();
        System.out.println("块读写文件拷贝完成,用时:"+(end-start)+"ms");

        inputStream.close();
        outputStream.close();

    }

}
