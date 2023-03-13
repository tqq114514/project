package ooday02;

public class Teacher extends Person{
    double salary;
    void  teach(){
        System.out.println(name+"正在上课。");
    }
   Teacher(String name,int age,String address,double salary){
        super(name,age,address);
        this.salary=salary;
   }
    void sayHi(){
        System.out.println("大家好，我的名字叫"+name+",我今年"+age+"岁了，我住在"+address+"，"
                +"我的薪水是："+salary+"。");
    }
}
