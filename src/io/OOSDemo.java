package io;

import java.io.*;

/*对象流是处理流
* ObjectInputStream、ObjectOutputStream
* 进行对象的序列化和反序列化
* 序列化：将对象转换为字节序列（可以存储或传输的数据）的过程
* 反序列化*/
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "张三";
        int age = 25;
        String gender = "男";
        String[] otherInfo = {"是一名学生","来自珠海","喜欢唱跳rap篮球"};
        Student cxk = new Student(name,age,gender,otherInfo);
        System.out.println(cxk);

        /*对象输出流在序列化对象时，必须保证序列化对象必须实现Serializable接口*/
        FileOutputStream fos = new FileOutputStream("./zs.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cxk);
        System.out.println("写完了");
        oos.close();



    }
}
