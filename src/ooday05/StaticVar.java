package ooday05;

public class StaticVar {
    int a;  //实例变量
    static  int b;  //静态变量
    StaticVar(){
        a++;
        b++;
    }

    void show(){
        System.out.println("a="+a+",b="+b);
    }
}
/*实例变量属于对象，存储在堆中，有三个对象则有三份，每有一个对象，就存一次a=0到堆中，并调用构造方法+1
* 而静态变量只有一份，存储在方法区中，属于类，直接打点访问，new三次则累加到3*/
