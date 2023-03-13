package io2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*使用转换流读取文件*/
public class InputStreamReader1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./lala.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int d ; //读到的数
        while ((d=isr.read())!=-1){
            System.out.print((char)d);
        }
        isr.close();
    }
}
