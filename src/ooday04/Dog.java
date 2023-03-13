package ooday04;

public class Dog extends Animal implements Swim{
    Dog(String name,int age,String color){   //构造方法初始化
        super(name,age,color);
    }
    void eat(){   //重写的方法
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的狗正在吃狗粮。%n",name,age,color);
    }
    void lookHouse(){   //特有的方法
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的狗正在看家。%n",name,age,color);
    }
    public void swim(){   //接口的实现
        System.out.printf("名叫%s的，今年%d岁的，颜色是%s色的狗正在游泳。%n",name,age,color);
    }

}
