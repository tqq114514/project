package io2;
/*单字节写*/
import java.io.FileOutputStream;
import java.io.IOException;

public class SingleByteWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream stream = new FileOutputStream("./homework.txt");
        stream.write(12);
        stream.write(34);
        System.out.println("写好了");
        stream.close();
    }
}
