package ooday04;

public class AnnoInnerClassDemo {
    public static void main(String[] args) {
        /*匿名内部类测试*/
        /*创建了Test1的派生类*/
        int num = 5;
        num = 6;
        Test1 test1 = new Test1(){};
        Test2 test2 = new Test2() {
            @Override
            void show() {
                System.out.println("show");
                /*num=55;*/
            }
        };
        test2.show();

    }
}
/*创建了Test1,Test2的抽象类*/
abstract class Test1{}
abstract class Test2{
    abstract void show();
}