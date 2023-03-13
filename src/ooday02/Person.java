package ooday02;

public class Person {
    String name;
    int age;
    String address;
    /*是谁的属性，就在谁的构造方法中进行赋值 */
    /*自己写了构造方法，则系统不再提供无参构造方法*/
    Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void eat(){
        System.out.println(name+"正在吃饭。");
    }
    void  sleep(){
        System.out.println(name+"正在睡觉。");
    }
    void sayHi(){
        System.out.println("大家好，我的名字叫"+name+",我今年"+age+"岁了，我住在"+address+"。");
    }

    /*java规则：构造派生类之前必须构造超类*/
}
