package object;

public class ObjectDemo {

    public static void main(String[] args) {
        /*Point p = new Point(100,200);
        System.out.println(p); //默认调用Object中的toString,然而输出的包名.类名@hashCode对我们没有意义
        *//*我们需要重写toString()方法
        * 获取对象的属性值
        * 即重写toString方法,String,StringBuilder都可直接输出*//*
        System.out.println(p.toString());
        StringBuilder builder = new StringBuilder("12json");
        System.out.println(builder);*/

        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println(p1 == p2);  //比较的是地址
        System.out.println(p1.equals(p2));  //Object类的内部比较的还是地址，没有参考意义
        /*要比较对象属性是否相同，应该对Object类中的equals()进行重写*/

        StringBuilder builder = new StringBuilder("12");
        StringBuilder builder1 = new StringBuilder("12");
        System.out.println(builder.equals(builder1));
        /*StringBuilder没有对equals方法进行重写，返回的还是object类中的equals()方法
        * 但StringBuilder对toString()方法进行了重写*/

        System.out.println(p1.equals(builder));  //p1与builder所属对象类型不同


    }
}
