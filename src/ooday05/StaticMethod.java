package ooday05;

public class StaticMethod {
    int a;  //实例对象，属于对象.a来访问，通过对象来访问
    static int b; //通过类名.b访问
    //静态变量用StaticMethod
    //实例变量用this.

    void show(){   //有隐私this
        System.out.println(this.a);
        System.out.println(StaticMethod.b);

    }
    static void test(){   //没有隐式this
        /*静态方法中没有隐式this传递
        * 没this意味着没有对象
        * 而实例变量a必须通过对象来访问
        * */
        /*System.out.println(this.a);*/    //静态方法中不能直接访问实例成员
        System.out.println(StaticMethod.b);
    }
     void say(){      //需要操作使用实例变量
        System.out.print(a);   //涉及实例变量或方法，需要对象访问，需要this
    }
    //
    static  int plus(int num1,int num2){   //不需要操作使用实例对象，可以设计为静态方法
        int num = num1+num2;
        return num;
    }
}
