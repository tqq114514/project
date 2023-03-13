package string;

public class StringDemo {
    public static void main(String[] args) {
        /*使用字面量("")来创建字符串对象时，JVM会检查常量池中是否有该对象
        * 若没有，创建字符串对象，并将其引用存到常量池
        * 若有，直接将常量池中的对象（引用）返回，不会创建新的字符串对象
        * 字符串常量池位于堆中
        * */

        /*String s1 = "test123";
        String s2 = "test123";
        System.out.println(s1==s2);
        *//*引用类型使用==，比较的是地址*//*
        s1 = s1+"!";   //创建了新的字符串对象，并将地址赋给s1
        System.out.println(s1==s2);
        String str = new String("114514");*/

        /*String s1 = "114514";  //在堆中创建114514字符量对象，并缓存到常量池中
        String s2 = "114"+"514";
        *//*s2被直接编译为了114514*//*
        System.out.println(s1==s2);  //true

        String s3 = "114";
        //s3是个变量，在编译期没有直接编译好
        String s4 = s3+"514";  //创建一个新的对象存储了114514
        System.out.println(s1==s4);  //false*/

        String str = new String("114514");
        String str1 = "114514";
        System.out.println(str == str1);  //false，比较的是地址
        /*实际指向的地址不同，str指向String对象地址，存入常量池。
        * str1指向字面量对象地址，存入常量池*/
        System.out.println(str.equals(str1)); //true，比较的是值

        /*String是不变对象，是final类型，一旦创建不可改变*/



    }
}
