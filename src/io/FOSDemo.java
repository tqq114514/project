package io;

import java.io.*;

/*Java将输入流和输出定义为两个对应的超类InputStream、OutputStream，他们
* 都是抽象类，定义了读取字节和写出字节的相关方法
* 文件流：FileInputStream，FileOutputStream继承自这两个超类，用于对文件进行读写操作
* 实际流入流出的是字节*/
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./fos.dat");
        FileOutputStream stream = new FileOutputStream(file,true); //根据File实例来定义文件输出流
        /*FileOutputStream stream = new FileOutputStream("./fos.dat");*/  //定义文件输出流
        /*写的是1的低八位和2的低八位*/
        /*stream.write(1);
        stream.write(2);*/
        stream.write(3);
        System.out.println("写好了");
        stream.close();

    }
}
