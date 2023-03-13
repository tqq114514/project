package ooday03;

public class Chick extends Animal {
    Chick(String name,int age,String color){
        super(name, age, color);
    }
    @Override
    void eat(){
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的鸡正在饲料。%n",name,age,color);
    }
    void layEggs(){
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的鸡正在下蛋。%n",name,age,color);
    }
}
