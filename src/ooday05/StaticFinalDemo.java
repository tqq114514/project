package ooday05;

import java.awt.event.KeyEvent;

/*常量必须声明的同时初始化，
常常通过类名.来访问，不能被改变
建议：常量名所有字母都要大写，并且之间用_分隔
应用场合：在程序运行的时候数据固定不变，并且经常使用*/
public class StaticFinalDemo {
    public static void main(String[] args) {
        /*pi.pi = 3.14;*/   //常量不能被改变
        System.out.println(pi.PI);
        //编译器在编译时会将常量直接替换为具体的数字，效率高
        System.out.println(pi.COUNT);
        /*1、加载pi.class到方法区
        * 2、加载静态变量num一并存储到方法区
        * 3、到方法区中获取num值并输出*/
        System.out.println(pi.num);
        int s = KeyEvent.VK_A;
        System.out.println(s);
    }
}
class pi{
    public static int num = 5;
    public static final int COUNT = 5;
    public static final double PI = 3.1415926535;
    public static final double A = 56;
}
