package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/*读取文本数据*/

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./114514.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];  //创建与文件等长的字节数组
        fis.read(bytes); //字节数组输出看不懂，要转换为String输出
        String s = new String(bytes, Charset.defaultCharset());
        System.out.println(s);
        fis.close();
    }
}
