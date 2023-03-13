package io2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*反序列化，将一组字节流还原为Java对象*/
public class ObjectInputStream1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("./work.obj");
        ObjectInputStream oos = new ObjectInputStream(fis);
        Object o = oos.readObject();
        Student s = (Student) o;
        System.out.println(s);
        oos.close();

    }
}
