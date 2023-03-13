package ooday02;

public class Student extends Person{
    String stuId;
    String className;
    void  study(){
        System.out.println(name+"正在学习。");
    }
    Student(String name,int age,String address,String className,String stuId){
        super(name,age,address);
        this.className = className;
        this.stuId = stuId;
    }
    void sayHi(){    //方法的重写(override)，发生在父子类中，方法名相同，且参数列表相同，是覆盖
        System.out.println("大家好，我的名字叫"+name+",我今年"+age+"岁了，我住在"+address+"，"
                +"我的班级是"+className+"，我的学号是"+stuId+"。");
    }
    /*继承的是超类的成员变量和普通方法，不包括超类的构造方法
    * 构造方法是被子类（派生类）调用的，不是继承过来的*/
}
