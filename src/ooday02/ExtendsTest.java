package ooday02;
/*
* 继承的演示*/
public class ExtendsTest {
    public static void main(String[] args) {
        /*Student zs = new Student();
        zs.name= "张三";
        zs.age = 19;
        zs.address="黑龙江漯河市";
        zs.className="JST2302";
        zs.stuId="001";
        zs.eat();
        zs.sleep();
        zs.sayHi();
        zs.study();
        System.out.println();*/
        Student zs = new Student("张三",19,"黑龙江漯河市","JST2302","001");
        zs.eat();
        zs.sleep();     //重写方法被调用时，看对象的类型，new谁调用谁
        zs.sayHi();   //有，调用子类，无，调用父类
        zs.study();
        System.out.println();

        /*Teacher ls = new Teacher();
        ls.name= "李四";
        ls.age = 25;
        ls.address="浙江省杭州市";
        ls.salary = 9000.88;
        ls.eat();
        ls.sleep();
        ls.sayHi();
        ls.teach();
        System.out.println();*/
        Teacher ls = new Teacher("李四",25,"浙江省杭州市",9000.88);
        ls.eat();
        ls.sleep();
        ls.sayHi();
        ls.teach();
        System.out.println();

        /*Doctor ww = new Doctor();
        ww.name= "王五";
        ww.age = 30;
        ww.address="浙江省丽水市";
        ww.title = "主任医师";
        ww.eat();
        ww.sleep();
        ww.sayHi();
        ww.cut();*/

        Doctor ww = new Doctor("王五",30,"浙江省丽水市","主任医师");
        ww.eat();
        ww.sleep();
        ww.sayHi();
        ww.cut();
        System.out.println();

    }
}
