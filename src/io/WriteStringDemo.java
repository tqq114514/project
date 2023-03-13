package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*向文件中写入文本数据
* */
public class WriteStringDemo{
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./114514.txt",true);
        String s ="这是要写入的字符串1\n";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8); /*标准字符集*/
        fos.write(bytes);
        byte[] ss ="这是要追加的字符串2\n".getBytes(StandardCharsets.UTF_8);  //字符串转化为字节流
        fos.write(ss);
        System.out.println("写入完毕");
        fos.close();
        /*文字与二进制 对应关系有各种标准：字符集
        * 支持中文的字符集
        * UTF-8 中文占3
        * GDK  中文占2*/

    }
}
