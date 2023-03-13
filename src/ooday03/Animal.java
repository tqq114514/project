package ooday03;

public abstract class Animal {
    String name;
    int age;
    String color;
    Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void drink(){
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的动物正在睡觉。%n",name,age,color);
    }
    abstract void eat();
}
