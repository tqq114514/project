package day06;

import java.util.Scanner;

public class MethodDemo  {
    public static void main(String[] args) {
        /*方法应尽可能独立，一个方法干一件事情
        * 带小括号的是方法
        * 方法可以反复多次调用
        * 可以减少代码的重复，维护更加方便
        * 只要是一个独立的业务功能，就封装到一个方法中*/
        /*有没有返回值？后期需要用到方法中的数据，就返回值
        * 如 System.out.println("hello"); 输出之后就不管了,不需要返回结果
        * int a = scanner.nextInt(); 需要用到用户输入的数据，需要返回值 */
        //有参数可以使方法更灵活
        //比如random() 里面数据范围都是写死的
        //假设其有参数，如random(1,100); 用户可以自由决定随机数的范围,()是方法的标志，必不可缺
        say();
        System.out.println();
        sayPlus("张三",18);    //调用时的参数叫做实参
        double m =14.2,n = 14.8;
        double sum1 = addition(m,n);
        System.out.println("加法的结果是："+sum1);

        double sum2 = addition(12.0,13.0);
        System.out.println("加法的结果是："+sum2);

        System.out.println(addition(12.3,12.5));

        int[] arr1 = testArray(8,100);   //根据用户要求的数组长度，要求的随机数传参数
        /*用户1想输出数组长度*/
        System.out.println("数组的长度"+arr1.length);
        /*用户2想输出数组中第一个值*/
        System.out.println("数组的第一个值为"+arr1[0]);
        /*用户三想整个输出*/
        for (int i =0 ; i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
        say1("张三",12);
        say1("李四",81);
    }
    public static void say(){
        System.out.println("大家好，我叫xxx,我的年龄是23岁。");
    }
    public static void  sayPlus(String name,int age){
        System.out.println("大家好，我叫"+name+",我的年龄是"+age+"岁。"+"\n");
    }
    private static double addition(double a,double b){  //仅声明的参数叫形参
        double sum =a + b;
        return sum;  //结束方法的执行，将结果返回调用方,返回的是数，不是变量
        /*return 的返回类型必须与返回值类型相同*/
    }
    private static int[] testArray(int length,int max){
        int[] array = new int[length];
        for (int i=0;i<array.length;i++){
            array[i] = (int)(Math.random()*(max+1));  //从0~100写法,(0.0~0.999999)*101
        }                                      //从1~100，(int)(Math.random()*max+1));
        return array;
    }
    /*return;的用法：在某种情况下提前结束方法*/
    /*比如不输出60岁及以上的老人*/
    public static void say1(String name,int age){
        if(age>=60){
            return;
        }
        System.out.println("大家好，我叫"+name+",我的年龄是"+age+"岁。");
    }
}
