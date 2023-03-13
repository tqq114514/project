package ooday02;

public class Fish extends Animal{
    Fish(String name, int age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.println("名叫"+name+"，年龄"+age+"岁，"+color+"色的鱼正在吃虾米。");
    }
}
