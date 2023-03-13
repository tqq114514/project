package day06;

public class MethodPractice {
    public static void main(String[] args) {
        /*double a =getNum();
        System.out.println(a);*/
        say();
        sayHi(70);
        sayHello(50,"张三丰");
        sayHelloExcept("王五",40);
        sayHelloExcept("王五2",80);
        double num = getNum();
        System.out.println("返回的值是："+num);
        int m =23,n = 78;
        int sum1 = add(m,n);
        System.out.println("加和为"+sum1);

        /*用户1：利用该随机数组输出数组的长度*/
        int[] arr1 = filling(5,10);  //要5个整数，数字在0-10之间
        System.out.println("你要的数组长度是:"+arr1.length);
        /*用户2：利用该随机数组输出数组的最后一项*/
        System.out.println("你要的数组最后一项是:"+arr1[arr1.length-1]);
        /*用户3：完整输出该数组*/
        System.out.print("你要的数组是:"+"\t");
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }

    }
    /*无参无返回值*/
    public static void say(){
        System.out.println("我的名字是李四，我今年30岁了。");
    }
    /*有一个参数无返回值*/
    public  static void sayHi(int age){
        System.out.println("我的名字是张三，我今年"+age+"岁了。");
    }
    /*有两个参数无返回值*/
    public  static void sayHello(int age,String name){
        System.out.println("我的名字是"+name+"，我今年"+age+"岁了。");
    }
    /*有参无返回值，提前结束方法，比如排除60岁及以上老人,用return提前结束运行*/
    public  static void sayHelloExcept(String name,int age){
        if (age>=60){
            return;
        }
        System.out.println("我的名字是"+name+"，我今年"+age+"岁了。");
    }
    /*定义getNum()无参有返回值方法，演示return的用法*/
    public static double getNum(){
        return  8.88;
    }
    /*加法器，两个参数有返回值*/
    public static int add(int m,int n){
        int sum = 0;
        sum = m + n;
        return  sum;
    }
    /*随机生成整型数组（0~100）填充用户所需长度及所需大小的数组0~max*/
    public static int[] filling(int length,int max){
            int[] array = new int[length];
            for (int i = 0;i<array.length;i++){
                array[i] = (int)(Math.random()*(max+1));
        }
            return array;
    }

}
