package ooday02;

public class Animal {
    String name;
    int age;
    String color;
    Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color= color;
    }
    void drink(){
        System.out.println("名叫"+name+age+"岁"+color+"色的动物正在喝水。");
    }
    void eat(){                //继续更改
        System.out.println("名叫"+name+age+"岁"+color+"色的动物正在吃东西。");
    }
}
