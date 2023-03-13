package ooday04;

public class AnimalTest2 {
    public static void main(String[] args) {
        /*多态向上造型案例2
        * 将超类型（Animal）作为参数或者返回值类型，传递或者返回派生类（Dog/Fish/Chick）对象，以扩大方法的应用范围
        * （所有Animal）,实现代码复用*/
        Master1 master1 = new Master1();
        Dog dog = new Dog("小黑",10,"黑");
        Chick chick = new Chick("小黄",1,"黄");
        Fish fish = new Fish("小金",2,"金");
        master1.feed(dog);
        master1.feed(chick);
        master1.feed(fish);
        master1.feed1(dog);
        /*System.out.println();
        Animal animal = new Dog("小黑",10,"黑");
        animal.drink();
        animal.eat();
        Animal animal1 = new Chick("小黄",1,"黄");
        animal1.drink();
        animal1.eat();
        Animal animal2 = new Fish("小金",2,"金");
        animal2.drink();
        animal2.eat();*/
    }
}
