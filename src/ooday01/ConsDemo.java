package ooday01;
/*构造方法的演示*/
public class ConsDemo {
    public static void main(String[] args) {
       Student zs = new Student();
       Student li = new Student("李四",14);
       Student ww = new Student("王五",23,"jst2302","003");
       zs.sayHi();
        System.out.println();
       li.sayHi();
        System.out.println();
       ww.sayHi();
        System.out.println();
    }
}
