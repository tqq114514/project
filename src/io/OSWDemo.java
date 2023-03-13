package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/*转换流：InputStreamReader和OutputStreamWriter,他们继承自Reader和Writer，是非常常见的字符流实现类
* 转换流是常见的字节流实现类，实际中不会直接操作这两个流，实际中用于流连接
* 由于它是可以直接连接在字节流上的字符流
* 则可以用于串联其他字符流
* 字符流到字节流*/
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./zh.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);  //创建转换流时要明确字符集，以此来保证跨平台
        osw.write("a你好世界\n");
        osw.write("你好未来\n");
        System.out.println("写好了");
        osw.close();




    }
}
