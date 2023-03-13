package ooday02;

public class NewExtendsTest {
    public static void main(String[] args) {
        NewTeacher newTeacher = new NewTeacher("小李",30,"丽水",6500.98);  //调用构造方法
        newTeacher.eat();   //调用普通方法
        newTeacher.sleep();
        newTeacher.sayHi();
        newTeacher.teach();
        NewStudent newStudent = new NewStudent("小红",23,"杭州","jsdt2302","001");
        newStudent.eat();
        newStudent.sleep();
        newStudent.sayHi();
        newStudent.study();
        NewDoctor newDoctor = new NewDoctor("小明",28,"广州","副主任医师");
        newDoctor.eat();
        newDoctor.sleep();
        newDoctor.sayHi();
        newDoctor.cut();

    }
}
