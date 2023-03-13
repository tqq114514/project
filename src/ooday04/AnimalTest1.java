package ooday04;

public class AnimalTest1 {
    public static void main(String[] args) {
        /*多态应用一
        将不同对象（狗、鱼、鸡）统一封装到一个数组（动物数组）进行访问，实现代码复用*/
        Animal[]  animals = new Animal[3];  //动物对象数组，向上造型
        animals[0] = new Dog("小黑",10,"黑");
        animals[1] = new Chick("小黄", 2,"黄");
        animals[2] = new Fish("小金",1,"金");
        for (int i =0;i<animals.length;i++){
            System.out.println(animals[i].name);
            animals[i].eat();
            animals[i].drink();
            /*还想输出父类里没有的方法，则向下转型*/
            if(animals[i] instanceof Dog){
                Dog dog = (Dog) animals[i];
                dog.lookHouse();
                dog.swim();
            }
            if(animals[i] instanceof Chick){
                Chick chick = (Chick) animals[i];
                chick.layEggs();
            }
            if(animals[i] instanceof Fish){
                Fish fish = (Fish) animals[i];
                fish.swim();
            }
            if(animals[i] instanceof Swim){     //会游泳就去游泳
                Swim swim = (Swim) animals[i];
                swim.swim();
            }
            //能用父（超类和接口），不用子
        }

    }
}
