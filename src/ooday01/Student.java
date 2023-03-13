package ooday01;
/*学生类*/
public class Student {
    /*成员变量(作用于整个类)*/
    String name;
    double price;
    int age;
    String className;
    String idNum;
    /*方法,this只能用在方法中，方法中访问成员变量之前默认有个this*/
    void study(){        // ww.study               ww.study
        System.out.println(this.name+"正在学习，有"+this.price+"元");
    }
    void sayHi(){                                                             //ww.sayHi  ww.sayHi   ww.sayHi      ww.sayHi
        System.out.printf("大家好，我的名字是%s,我的年龄是%d,我的班级是%s,我的学号是%s",this.name,this.age,this.className,this.idNum);
    }
    void playwith(String anotherName){   //ww.palywith(String)
        System.out.println(this.name+"正在和"+anotherName+"一起玩。。。");
    }
    /*构造方法：给成员变量赋初始值，减少代码重复
     * 方法名必须与类同名，没有返回值类型(连void都没有)
     * 调用：在（new）对象时自动调用构造方法
     * 构造方法也可以重载
     * 自己不写构造方法，系统默认提供一个无参构造方法，自己写了，系统不再提供*/
    Student(){
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    Student(String name,int age,String className,String idNum){
             this.name = name;   //局部变量只能在所属方法中使用
             this.age = age;     //成员变量和局部变量可以同名，使用的时候采用就近原则，name=name就不好用,都指的是参数名
             this.className = className;
             this.idNum = idNum;
    }
    /*this用法
    this.成员变量名：访问成员变量
    this.方法名()，this.study(),一般不使用
    this()调用构造方法，一般也不用*/


}
