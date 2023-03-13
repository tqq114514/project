package day02;

public class VarDemo {
    public static void main(String[] args) {
        int a;
        int b,c,z;   //同时声明三个整形变量，变量灰色ide认为变量无意义
        //int a;   //编译错误，变量不能同名
        int d=832789;  //初始化，声明整型变量d并同时赋值
        int f;
        f=12368;
        f=11;  //修改变量f的值为11
        int g=223,h=23,i=2323,j=22323; /*
        声明四个整型变量g,h,i,j，并分别赋值,变量如果被用过就是黑色了*/
        System.out.println(d);

        int k =5;
        int m= k+10; //取出k的值+10再赋值给m
        System.out.println(m); //输出变量的值而非输出m
        /*java所有变量必须赋值并初始化，赋值遵循先后关系*/
        int balance = 5000;
        balance =balance+1000;
        System.out.println(balance);
        //balance =7000;   //重新赋值操作
        System.out.println(balance);
        balance= balance-2000;
        System.out.println(balance);

        //System.out.println(n);  //编译错误，变量n未声明
        int n;
        //System.out.println(n);  //变量未初始化也不行
        /*java对变量的操作就是操作变量里面所存的值*/

        /*变量的命名规则：只能包括字母，数字，_，$，
           不能以数字开头，严格区分大小写
           不能使用关键词，即亮蓝色
           允许中文命名，但不推荐
        * */
        int a1,a_$f5,_5,$12,$_;
        //int 4a;
        //int a*f;
        //System.out.println(A1);
        //int class;
        int age=23; //建议英文简明致意
        int  score,myScore,myJavaScore;//小驼峰命名,还适用于方法
        //所有首字母都大写，所有单词首字母都大写，大驼峰命名法
        int Score,MyScore,MyJavaScore; //适用于类的命名，大驼峰命名法
        /*整数：byte,short(300多太小不用,与其他语言兼容),int,long
        int:
        long:
        float(兼容)单精度,double 双精度
        boolean:
        char:
        *  */
    }
}
