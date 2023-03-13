package ooday03;

public class AnimalTest1 {
    public static void main(String[] args) {
        /*引用数组*/
        Dog1[] dogs = new Dog1[3];
        dogs[0] = new Dog1("小黑",10,"黑");
        dogs[1] = new Dog1("小白",11,"白");
        dogs[2] = new Dog1("小黄",2,"黄");
/*        dogs[2] = null;*/
        System.out.println(dogs[0].name);
        dogs[1].age = 5;
        dogs[2].Swim();
        for (int i =0;i<dogs.length;i++){
            System.out.println(dogs[i].color);
            dogs[i].eat();
        }
        /*for (Dog dog:dogs){
            System.out.println(dog.name);
            dog.eat();
        }*/



        /*Fish[] fishes = new  Fish[2];
        fishes[0] = new Fish("小金",2,"金");
        fishes[1] = new Fish("小红",5,"红");
        System.out.println(fishes[0].name);
        fishes[1].age = 8;
        fishes[0].eat();
        for (Fish fish : fishes) {
            System.out.println(fish.name);
            fish.drink();
        }*/
        /*数组对象可以使用增强for循环*/
        /*for(数据类型 变量名 :遍历的目标){ //数据类型 变量名:声明一个变量用来接收遍历目标遍历后的元素

}*/

        /*Dog dog = new Dog("小黑",5,"黑");
        dog.drink();
        dog.eat();
        dog.lookHouse();
        dog.Swim();
        Chick chick = new Chick("小黄",2,"黄");
        chick.drink();
        chick.eat();
        chick.layEggs();
        Fish fish = new Fish("小金",8,"金");
        fish.drink();
        fish.eat();
        fish.Swim();*/


    }
}
