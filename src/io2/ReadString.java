package io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/*读文本数据*/
public class ReadString {
    public static void main(String[] args) throws IOException {

        /*创建与文件等长的字节数组*/
        /*一次性读取数据到这个数组中去*/
        /*将得到的字节流还原为字符型*/
        File file = new File("./homework.txt");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        inputStream.read(bytes);
        String ss = new String(bytes,StandardCharsets.UTF_8);
        System.out.println(ss);
        inputStream.close();


    }
}
