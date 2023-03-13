package day02;

import java.math.BigDecimal;

public class DataTypeDemo {
    public static void main(String[] args) {
        //数据类型由小到大
        /*byte 8位有符号整型
        * short 16位短整型
        * char 16位字符型
        * int 32位整型
        * long 64位长整型
        * float 32位单精度浮点型
        * double 64位双精度浮点型*/
        //当小类型转大类型时不需要强制类型转换，当大类型转小类型时需要强制类型转换
        int a =77;
        long b = a;   //隐式转换
        int c = (int) b; //强制类型转换，将long型b转化为int型，不丢精度
        //自动类型转换，一定不会丢精度
        long d = 5;
        double e = 5;
        System.out.println(e);
        //强制类型转换溢出的情况
        long f = 20000000000L;
        int g = (int) f;
        System.out.println(g);
        //强制类型转换丢精度的情况
        double h =25.543;
        int i = (int) h;
        System.out.println(i);
        //直接量在范围内可以直接给byte,short,char赋值
        byte aa = 5;
        short bb = 6466;
        //byte,short,char型数据参与运算时，系统会先转换为int
        byte b1= 5;
        byte b2 =6;
        byte b3 = (byte) (b1+b2);
        System.out.println(b3);
        System.out.println(2+2);  // 4
        System.out.println(2+'2');   //52
        System.out.println('2'+'2');  //是字符，是运算，先转换为int型再相加为100
        System.out.println('2');   //输出字符2
        //看字符对应码
        int aaa = '我';
        System.out.println(aaa);
        //看码对应的字符
        char bbb = 8382;
        System.out.println(bbb);

      /*//char:字符型，2个字节，计算机一个字符两个字节，采用Unicode编码，java中的char只是其中的一个子集，一个字符对应一个码
        //需要记住几个ASCII码 ‘a'--97   'A' -- 65    '0'  -- 48
        //看起来是字符char，其实是码int(0~65536),只能放在单引号中，有且仅有一个，单引号中不写不行
        //区间范围0~65535 2^16-1
        //有些特殊字符如'必须进行转义，'\''
        char c1 = '女';
        char c4 = ' ';   //必须有字符，比如说一个空格
        *//*char c7 = '10';*//*  //只能装一个字符
        char c8 = 97;
        System.out.println(c8);
        int c9 = 98;
        System.out.println(c9);
        int c10 = 'c';
        System.out.println(c10);  //print会根据变量的类型进行输出，是字符输出字符，是数字输出数字
        char c11 = '\n';
        System.out.println(c11);
        char c12 = '\\';
        System.out.println(c12);
        char c13 = '\uffff';
        System.out.println(c13);*/

/*      //boolean:布尔型，1个字节，只能存储true,false
       boolean a = true,b = false;
       //boolean c= 23.342;  //布尔型只能存储true or false
        if (a&&b){
            System.out.println("hh");
        }else {
            System.out.println("no");
        }*/

        /*double 浮点型，8个字节，范围很大很大，在java中小数默认为double类型，需要表示float,末尾加F*//*
        double a= 32948.324;         //小鼠直接量，默认为double类型，双精度浮点型
        float b =1387.21348F;       //float型直接量，单精度浮点型
        double c=6.0, d=5.9;
        System.out.println(c-d);  //注意不能精确表示数据，运算时会发生舍入误差
        //精确类型用BigDecimal*/

        /*long a = 25L;
        long d = 365L*24*60*60*1000;  //去年一年所经历的毫秒数
        System.out.println(d);
        *//*long f = 1000000000*3*10L;   //溢出了，结果不是300亿
        System.out.println(f);*//*
        //为避免溢出，将L放在首位，防止溢出错误
        //long 8字节，范围大概在-900万万亿多到900万万亿多
        long e = 1000000000*2*10l;
        System.out.println(e);
        long ff = 1000000000*3*10l;   //溢出
        System.out.println(ff);
        long gg = 1000000000L*3*10;
        System.out.println(gg);
        */

        /*int a = 250; //250是整数直接量，默认为int类型
        //int b = 10000000000; //100亿直接数，超过范围
        //int c = 25.678; //整数类型只能装整数
        System.out.println(5/2);
        System.out.println(2/5);
        System.out.println(5/2.0);
        int d = 2147483647;
        d=d+1;
        System.out.println(d);
        *//*int 四个字节，-21多亿~21多亿*//*
        *//*长整型
        表示长整型直接量，需要在直接量后加L
        * */

    }
}
