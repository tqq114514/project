package ooday01;
/*学生类的测试类*/
//类是一种引用数据类型，
public class StudentTest {
    public static void main(String[] args) {
        //创建一个学生对象
        Student zs = new Student("张三",25,"csd2302","001");
        //访问成员变量
        zs.name = "张三";
        /*zs.age = 25;
        zs.className ="class0210";
        zs.idNum = "001";*/
        //调用方法
        zs.study();
        zs.sayHi();
        System.out.println();
        zs.playwith("李四");
        System.out.println();

        Student ww = new Student();
        ww.study();
        ww.sayHi();
        System.out.println();
        ww.playwith(null);
        /*1、创建一个学生对象
        2、给成员变量赋默认值,引用类型变量默认值是null,如String
         byte,short,int,long,char为0
         boolean 默认值为false
         double,float默认值为0.0，
         student()  自动调用构造方法*/
    }


}

