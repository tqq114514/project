package io2;
/*单字节读*/
import java.io.FileInputStream;
import java.io.IOException;

public class SingleByteRead {
    public static void main(String[] args) throws IOException {
        FileInputStream stream = new FileInputStream("./homework.txt");
        int i = stream.read();
        System.out.println(i);
        System.out.println(stream.read());
        System.out.println(stream.read());
        stream.close();

    }
}
