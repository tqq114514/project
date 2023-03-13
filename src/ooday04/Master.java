package ooday04;

public class Master {
    void feed(Animal animal){   //只接受父类，鱼，鸡，狗都能吃，喝
        animal.eat();
        animal.drink();
    }
    void feed(Dog dog){
        dog.lookHouse();
        dog.swim();
    }

}
