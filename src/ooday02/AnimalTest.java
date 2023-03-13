package ooday02;

public class AnimalTest {
    public static void main(String[] args) {
          Dog dog = new Dog("旺旺",2,"黑");
          dog.eat();
          dog.drink();
          dog.lookHouse();
          Chick chick = new Chick("小黄",3,"黄");
          chick.eat();
          chick.drink();
          chick.layEggs();
          Fish fish = new Fish("小金",7,"白");
          fish.eat();
          fish.drink();
    }
}
