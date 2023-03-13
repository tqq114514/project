package ooday02;

public class NewPerson {
    /*成员变量，名字年龄地址，方法 eat、sleep、sayHi*/
    String name;
    int age;
    String address;

    NewPerson(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void eat(){
        System.out.printf("%s正在吃东西。%n",name);
    }
    void sleep(){
        System.out.printf("%s正在睡觉。%n",name);
    }
    void sayHi(){
        System.out.printf("大家好，我叫%s，我今年%d岁了，我住在%s。%n",name,age,address);
    }

}
