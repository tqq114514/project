package ooday05;

public class StaticVariable {
    int a;
    static int b;
    StaticVariable(){
        a++;
        b++;
    }
     void show(){
        System.out.println("a="+a+","+"b="+b);
    }
}
