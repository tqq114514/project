package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*将一个文件中的数据复制到另一个文件中，每次只读一字节，效率很低，要使用块读写*/
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream oldP = new FileInputStream("p.jpg");
        FileOutputStream newP = new FileOutputStream("pp.jpg");
        long start = System.currentTimeMillis();
        int d ; //记录每次读到的字节
        while ((d=oldP.read())!=-1){
            newP.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("写入复制完毕,耗时："+(end-start)+"ms");
        oldP.close();
        newP.close();
    }
}
