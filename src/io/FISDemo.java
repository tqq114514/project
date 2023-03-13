package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("./fos.dat");
        int read = stream.read();  //读取第一个字节,输出十进制数据1
        System.out.println(read);
        read = stream.read();    //读取第二个字节，输出十进制数据2
        System.out.println(read);
        read = stream.read();    //读取第三个字节，输出十进制数据2
        System.out.println(read);
        read = stream.read();    //读取第四个字节，输出十进制数据2
        System.out.println(read);
        /*fas.dat的数据：
          00000001 00000010 文件末尾
        * ^^^^^^^^
        返回的int只有低八位有效
        * 第一次变量read的内容为00000000 00000000 00000000 00000001
        读到末尾变量里的内容是为 11111111 11111111 11111111 11111111
        十进制的值为-1
        */
        stream.close();

    }
}
