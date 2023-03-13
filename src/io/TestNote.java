package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*程序启动后用户在控制台输入的每一行字符串都写入文件note.txt中
* 知道用户单独输出exit时程序退出
* */
public class TestNote {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileOutputStream outputStream = new FileOutputStream("./note.txt",true);
        System.out.println("请输入数据");
        while (true){
            String inputString = scanner.nextLine();
            /*if (inputString.equals("exit")){
                break;
            }*/
            if ("exit".equals(inputString)){
                break;
            }
            outputStream.write(inputString.getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("写好了");
        outputStream.close();
    }
}
