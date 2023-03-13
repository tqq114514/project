package ooday04;

public class Fish extends Animal implements Swim{
    Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的鱼正在吃虾米。%n",name,age,color);
    }

    @Override
    public void swim() {
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的鱼正在游泳。%n",name,age,color);
    }
}
