package day03;

import com.sun.org.apache.xpath.internal.objects.XString;

public class OperDemo {
    public static void main(String[] args) {
        //单独用都是本身增加一，单独用指的是只有++和a本身，如a++
        /*int a=5;int b=5;
        a++;
        ++b;
        System.out.println(a);  //6
        System.out.println(b);  //6*/
        //被使用指的是除了++和a本身还有运算,输出,输出也叫做被使用，a++的值为a，++a 的值a+1
        /*int a=5,b=5;
        int c = a++;
        int d= ++b;
        System.out.println(a);  //6
        System.out.println(b);  //6
        System.out.println(c);  //5
        System.out.println(d);  //6*/

        /*//关系运算符
        int  a=5,b=10,c=5;
        boolean b1 = a>b;
        System.out.println(b1);  //false
        System.out.println(c<b);  //true
        System.out.println(a>=c); //true
        System.out.println(a<=b);  //true
        System.out.println(a==c);  //true
        System.out.println(a!=c);  //false
        System.out.println(a%2==0);  //false
        System.out.println(a+c>b);  //false
        System.out.println(a++>5); //false,a自增1变为6，a++的值为a=5，++a 的值a+1=6
        System.out.println(a++>5);  //true，a自增1变为7，a++的值为a=6，++a 的值a+1=7
        System.out.println(a);  //7*/

        /*//逻辑运算符，&& 逻辑与，并且      || 或者    ！非，逻辑运算建立在关系运算基础上，结果是boolean
          int a =5,b= 10 ,c=5;
          boolean b1 = b>=a && b<c;
        System.out.println(b1);        //false
        System.out.println(b<=c && b>a); //false
        System.out.println(a==b && b<c);  //false
        System.out.println(b!=c && b>a);  //true

        int age =99;   //年龄在1~99之间
        System.out.println(age>1 && age<=100); //true
        System.out.println(b>=a || b<c); //true
        System.out.println(b<=c || b>a);  //true
        System.out.println(b!=c || b>a);  //true
        System.out.println(a==b || b<a);  //false

        int score = 90;  //验证成绩是否非法，不非法
        System.out.println(score<0||score>100);//false || false = false

        boolean b2 = !(a<b);
        System.out.println(b2);  //false
        System.out.println(!(a>b));  //true

        //短路：逻辑与一旦碰见false,后半部分不执行
        //逻辑或一旦碰见true，后半部分不执行
        boolean b3 = a<b  || c++>2;
        System.out.println(b3);
        System.out.println(c);*/

        /*//赋值运算符   简单赋值 =   扩展赋值运算符+=  -=   *=  /=  %=
         //扩展运算符自带强制类型转换
        short s = 5;   //直接整数可以不超范围给short赋值
        s= (short) (s+10); //s = s+10;错误
        s += 10;  //自带强制类型转换
        System.out.println(s); //25
        int a = 5;
        a+= 10;
        System.out.println(a); //15
        a*= 2 ;
        System.out.println(a); //30
        a/= 4;
        System.out.println(a);  //7
        a%= 2;
        System.out.println(a); //1*/

        /*//字符串链接运算符  +:
        *//*两边为数字就是加法运算
        如果两边出现字符串，则做字符串连接
        * *//*
        int age = 22;
        System.out.println("年纪"+age+"=老了");
        //char字符型，单引号 ，1个符号
        //string:字符串型,是个类
        char a= '啊';
        String name = "XXX";
        String s = new String("ufo");
        System.out.println("看，那边有一个"+s+"，快跑"+a+"!");
        System.out.println("大家好"+"我的名字叫做"+name+",我今年"+age+"岁了。");
        String ss = new String("是ufo啊，啦啦啦，快来看!");
        System.out.println(ss);
        //任何类型的数据和字符串相连，结果都是字符串类型，同化
        System.out.println(10+20+""+30); //3030 30加字符串同化为字符串再和30连接
        System.out.println(""+10+20+30); //102030 1020字符串与30连接
        System.out.println(10+20+30+""); //60
*/

        //三目运算符，即操作三个数
        //boolean?数字一:数字二,boolean 为true ,则为数字一，false则为数字二
        int num = 7;
        int flag = num>0?1:2;
        System.out.println(flag);

        int a = 8,b = 7;  //应用：可以找两个数中的最大值
        int max = a>b?a:b;
        System.out.println(max);

    }
}
