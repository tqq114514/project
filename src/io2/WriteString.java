package io2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*写文本数据*/
public class WriteString {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("./homework.txt",true);
        String s1 = "这是要写入的文本数据\n";
        byte[] bytes = s1.getBytes(StandardCharsets.UTF_8);
        outputStream.write(bytes);
        String s2 = "这是要追加的文本数据\n";
        byte[] bytes1 = s2.getBytes(StandardCharsets.UTF_8);
        outputStream.write(bytes1);

    }
}
