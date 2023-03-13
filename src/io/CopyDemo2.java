package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*用字节块复制图片*/
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./p.jpg");
        FileOutputStream fos = new FileOutputStream("./ppp.jpg");
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[10*1024];  //一次读取10kb
        int len; //记录每次实际读取的字节数
        while ((len = fis.read(bytes))!=-1){
            /*fos.write(bytes);   //一次性也写入10kb数据*/
            fos.write(bytes,0,len);  /*将字节数组byte从下标0开始连续len个字节写出（读了多少就写多少
            ，避免出现末尾不足3字节，只写入一字节+上一组遗留+上一组遗留的问题*/

        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕，用时"+(end-start)+"ms");
        fis.close();
        fos.close();



        /*FileInputStream fis = new FileInputStream("./p.jpg");
        FileOutputStream fos = new FileOutputStream("./ppp.jpg");
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[10*1024];  //一次读取10kb
        while (fis.read(bytes)!=-1){
            fos.write(bytes);   //一次性也写入10kb数据
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕，用时"+(end-start)+"ms");
        fis.close();
        fos.close();*/


    }
}
