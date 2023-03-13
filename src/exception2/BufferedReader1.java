package exception2;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*缓冲字符流读取文本数据*/
public class BufferedReader1 {
    public static void main(String[] args) throws IOException {
        /*输入文件流：将字节从文件中读出来
        * 转换流：将字节流转化为字符流
        * 缓冲字符流：对字符流进行加速*/
        FileInputStream fis = new FileInputStream("hello.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        /*readline 时BufferedReader类的一个方法，用于从输入流中读取文本数据，直到
        读到行尾，不包括行终止符，读到换行符（一个空行）返回空串，输入流结束，则返回null
        * */
        String line;  //存储读到的文本数据
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();


    }
}
