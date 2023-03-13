package ooday03;

public class Fish1 extends Animal1 implements Swim1 {

    Fish1(String name, int age, String color) {
        super(name, age, color);
    }
    void eat(){
        System.out.printf("%s颜色的%d岁的名叫%s的鱼正在吃虾米。%n",color,age,name);
    }
    @Override
    public void Swim(){
        System.out.printf("%s颜色的%d岁的名叫%s的鱼会游泳。%n",color,age,name);
    }
}
