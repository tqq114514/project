package io2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*转换流，使用转换流将字符转为字节输入到文件中*/
public class OutputStreamWriter1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./lala.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        osw.write("A你好阿狸\n");
        osw.write("你好世界\n");
        System.out.println("写好了");
        osw.close();

    }
}
