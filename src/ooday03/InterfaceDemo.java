package ooday03;

public class InterfaceDemo implements interface1  {
    public static void main(String[] args) {
        /*interface1 interface1 = new interface1();*/  //接口是抽象的，不能被实例化
    }

    @Override
    public void test() {
    }

    @Override
    public void test1() {
    }
}

interface interface1{      //接口1
    public abstract void test();
    void test1();
}

interface interface2{     //接口2
    public abstract void test2();
    void test3();
}

interface interface3 extends interface2{      //接口的继承
    public abstract void test4();
}

class test2 implements  interface3{     //接口的实现
    public void test2(){}
    public void test3(){}
    public void test4(){}
}

/*既继承又实现*/

interface inter {
    public abstract void show();
}
interface inter1{
    void  eat();
}
abstract class father{
     abstract void say();
}
class son extends father implements  inter,inter1{
    public void show(){}
    public void  eat(){}
    void say(){}
}





