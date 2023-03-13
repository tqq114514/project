package ooday02;

public class Dog extends Animal{
    Dog(String name,int age,String color){
        super(name,age,color);
    }
    void lookHouse(){
        System.out.println("名叫"+name+"，年龄"+age+"岁，"+color+"色的狗能看家。");
    }
    void eat(){
        System.out.println("名叫"+name+"，年龄"+age+"岁，"+color+"色的狗正在吃骨头。");
    }
}
