package ooday03;

public class AnimalTest {
    public static void main(String[] args) {
       Chick chick = new Chick("小黄",2,"黄");   //只有一直鸡的情况
       chick.eat();
       chick.drink();
       chick.layEggs();
       System.out.println();

        Dog[] dogs = new Dog[3];   //dog数组对象,有很多狗的情况
        dogs[0] = new Dog("小黑",5,"黑");
        dogs[1] = new Dog("小白",1,"白");
        dogs[2] = new Dog("小黄",2,"黄");
        /*System.out.println(dogs[0].name);*/
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
       /* System.out.println(fishes[0].name="金光闪闪");*/
        fishes[1].color = "绿";
        for (int i = 0;i<fishes.length;i++){
            System.out.println(fishes[i].age);
            fishes[i].eat();
        }
        System.out.println();
        for (Fish fish:fishes){
            System.out.println(fish.color);
            fish.swim();
        }
    }
}
