package day02;

import org.omg.Messaging.SyncScopeHelper;

import java.sql.SQLOutput;

public class MyPractice {
    public static void main(String[] args) {
        int a;
        int b, c, d;
        int e = 1;
        int f;
        f = 10;
        int g = 1;
        int h = g + 10;
        System.out.println(h);
        g = g + 10;
        System.out.println(g);
        //变量名可以包括数字，字母，$，_
        //变量名不能以数字卡头，不能是保留字
        //用英文有确实含义
        //$123,re_,q23
        int age = 25;
        //应使用小驼峰命名法，如
        int score, myScore, myJavaScore;
        System.out.println(7 / 2); //3
        System.out.println(7 / 2.0); //3.5
        System.out.println(2 / 7); //0
        int aa = 2147483647;
        aa = aa + 1;
        System.out.println(aa);
        char c9 = '\\';
        System.out.println(c9);

        byte b1 = 127;
        byte b2 = 1;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3); //-128
        //整数直接量可以直接赋值给byte,short,char,但是不能范围
        //特别是字符型变量，运算时必须转化为int类型
        System.out.println(2 + 2); //4
        System.out.println(2 + 'c');//101
        System.out.println('c' + '2'); //149
        System.out.println('2'); //2
        //看字符对应的ascii码
        int dd = 'a';
        System.out.println(dd);  //97
        //看asicii码对应的字符
        char ee = 48;
        System.out.println(ee); //0

        //1B = 8bit  1字节=8位
        //1kb = 1024B 1千字节= 1024字节

        long aaa = 25;
        /*long b = 10000000000;*/  //强制类型转换如果是超过int类型的范围，可能会报错
        long bb = 10000000000L;
        long cc = 1000000000 * 3 * 10L;
        System.out.println(cc); //错误的输出
        long ddd= 1000000000L*3*10;
        System.out.println(ddd);
    }



}
