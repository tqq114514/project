package io;
/*将所有的小写字母写到文件fos.txt中
* */
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
/*char c ='a';     char c = 97;
本意：
整数97的二进制码与ASCII码中'a'的二进制是一样的  01100001
* */

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("./fos.txt");
        String s = "";
        for(int i = 0;i<26;i++){
            outputStream.write(97+i); //将整数(97+i)的二进制“低八位”写入文件中
        }
        System.out.println("写完了");
        outputStream.close();
    }
}
