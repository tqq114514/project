package ooday03;

public class Dog1 extends Animal1 implements Swim1 {
    Dog1(String name , int age, String color){
        super(name,age,color);
    }
    void eat(){
        System.out.printf("%s颜色的%d岁的名叫%s的狗正在吃骨头。%n",color,age,name);
    }
    void  lookHouse(){
        System.out.printf("%s颜色的%d岁的名叫%s的狗正在看家。%n",color,age,name);
    }

    @Override
    public void Swim() {
        System.out.printf("%s颜色的%d岁的名叫%s的狗会游泳。%n",color,age,name);
    }
}
