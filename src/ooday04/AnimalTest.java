package ooday04;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        double price = scanner.nextDouble();
        /*package java.util;    //导入包
        * class Scanner{        //Scanner类
        * scanner(InputStream s){  //构造方法带输入流的参数
        *    }
        * int nextInt(){      //方法带返回值，int,不带参数
        *    }
        * double nextInt(){  //方法带返回值double,不带参数
        *    }
        * }
        * .........*/
        /*Animal animal = new Animal();*/  //抽象类不能被实例化
        Animal[] animals = new Animal[5];   //创建Animal数组对象，向上造型后只能访问父类成员变量和方法,代码复用减少冗余
        animals[0] = new Dog("小黑",5,"黑");  //将所有不同对象装在一起来访问，多种形态
        animals[1] = new Dog("小黑",5,"黑");
        animals[2] = new Chick("小黄",2,"黄");
        animals[3] = new Fish("小红",1,"红");
        animals[4] = new Fish("小青",8,"青");
        for (int i =0;i<animals.length;i++){
            System.out.println(animals[i].color);
            animals[i].eat();
            animals[i].drink();
            /*animals[i].lookHome();*/     //不能直接调用派生类中特有的方法
            if(animals[i] instanceof Dog){   //强制类型转换-向下转型
                Dog dog = (Dog) animals[i];
                dog.swim();
                dog.lookHouse();
            }
            if(animals[i] instanceof Chick){
                Chick chick = (Chick) animals[i];
                chick.layEggs();
            }
            if(animals[i] instanceof Fish){
                Fish fish = (Fish) animals[i];
                fish.swim();
            }
            if(animals[i] instanceof Swim){   //实现Swim接口的都能游泳
                Swim s = (Swim) animals[i];
                s.swim();
            }


        }

       /* *//*多态应用2*//*
        Master master = new Master();
        Dog dog = new Dog("小黑",6,"黑");
        Fish fish = new Fish("小红",1,"红");
        Chick chick = new Chick("小黄",3,"黄");
        master.feed(dog);    //传递参数并且向上造型
        master.feed(fish);
        master.feed(chick);*/


       /*Chick chick = new Chick("小黄",2,"黄");   //只有一直鸡的情况
       chick.eat();
       chick.drink();
       chick.layEggs();
       System.out.println();


        Dog[] dogs = new  Dog[3];   //dog数组对象,有很多狗的情况
        dogs[0] = new Dog("小黑",5,"黑");
        dogs[1] = new Dog("小白",1,"白");
        dogs[2] = new Dog("小黄",2,"黄");
        *//*System.out.println(dogs[0].name);*//*
        dogs[1].age = 10;
        for (Dog dog:dogs){
            System.out.println(dog.name);
            dog.lookHouse();
        }
        System.out.println();

        //鱼数组对象，有很多条鱼需要调用
        Fish[] fishes = new Fish[4];
        fishes[0] = new Fish("小金",2,"金");
        fishes[1] = new Fish("小红",1,"红");
        fishes[2] = new Fish("小黑",4,"黑");
        fishes[3] = new Fish("小青",8,"青");
       *//* System.out.println(fishes[0].name="金光闪闪");*//*
        fishes[1].color = "绿";
        for (int i = 0;i<fishes.length;i++){
            System.out.println(fishes[i].age);
            fishes[i].eat();
        }
        System.out.println();
        for (Fish fish:fishes){
            System.out.println(fish.color);
            fish.swim();
        }*/
    }
}
