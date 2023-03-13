package ooday02;

public class NewStudent extends NewPerson{
    String stuId;
    String className;
    void  study(){
        System.out.println(name+"正在学习。");
    }
    NewStudent(String name,int age,String address,String className,String stuId){
        super(name,age,address);
        this.className = className;
        this.stuId = stuId;
    }
    void sayHi(){
        System.out.println("大家好，我的名字叫"+name+",我今年"+age+"岁了，我住在"+address+"，"
                +"我的班级是"+className+"，我的学号是"+stuId+"。");
    }
}
