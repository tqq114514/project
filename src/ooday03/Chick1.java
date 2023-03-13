package ooday03;

public class Chick1 extends Animal1 {
    Chick1(String name, int age, String color) {
        super(name, age, color);
    }
    void layEggs(){
        System.out.printf("%s颜色的%d岁的名叫%s的小鸡正在下蛋。%n",color,age,name);
    }
    void eat(){
        System.out.printf("%s颜色的%d岁的名叫%s的小鸡正在吃饲料。%n",color,age,name);
    }
}
