package io2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*对象序列化*/
public class ObjectOutputStream1 {
    public static void main(String[] args) throws IOException {
        String name = "蔡蔡";
        int age = 2;
        String gender = "男";
        String[] otherInfo = {"来自厦门","喜欢唱跳rap"};
        Student student = new Student(name,age,gender,otherInfo);
        System.out.println(student);


        FileOutputStream fos = new FileOutputStream("./work.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        System.out.println("写完了");
        oos.close();

    }
}
