package io;

import java.io.*;

/*反序列化：将一组字节还原为Java对象*/
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*对象输入流通过下面所连接的流来读取字节
        * 必须是对象输出流序列化对象之后的一组字节
        * 序列化的是学生对象，反序列化出来的也一定是学生对象*/
        FileInputStream fis = new FileInputStream("./zs.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        Student zs = (Student) o;
        System.out.println(zs);
        ois.close();
    }
}
