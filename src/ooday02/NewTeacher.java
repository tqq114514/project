package ooday02;

public class NewTeacher extends NewPerson{
    double salary;
    NewTeacher(String name,int age,String address,double salary){
        super(name, age, address);
        this.salary = salary;
    }
    void sayHi(){
        System.out.printf("大家好，我叫%s，我今年%d岁了，我住在%s，我的薪水是%.2f元。%n",name,age,address,salary);
    }
    void teach(){
        System.out.printf("%s正在上课。%n",name);
    }

}
