package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/*使用转换流读取文件*/
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./zh.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        int d ;
        while ((d=isr.read())!=-1){   //返回的是int值实际上是一个char，要看他的值要转为字符输出，返回-1表示读到了末尾
            /*一次读取几个字节要根据他的内容以及对应的字符集来决定，如utf-8字母读取1字节，汉字3字节*/
            System.out.print((char) d);
        }
        isr.close();
    }
}
