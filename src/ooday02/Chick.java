package ooday02;

public class Chick extends Animal{
    Chick(String name, int age, String color) {
        super(name, age, color);
    }
    void layEggs(){
        System.out.println("名叫"+name+"，年龄"+age+"岁，"+color+"色的小鸡会下蛋。");
    }
    void eat(){
        System.out.println("名叫"+name+"，年龄"+age+"岁，"+color+"色的小鸡正在吃饲料。");
    }
}
