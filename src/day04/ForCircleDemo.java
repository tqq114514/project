package day04;

public class ForCircleDemo {
    public static void main(String[] args) {
        for(int times=0;times<5;times++) {
            System.out.println("啦啦啦");
        }
        //for 结构 应用率最高，与次数有关的循环，但需要知道循环次数
            /*变量名不能重名在同一作用域中
            * 变量的作用域，从变量的声明开始到包括它的大括号*/
            //注意for循环的变量num作用域仅在for循环中
            //可以在不同for循环中重名
            /*1-9 1，3，7乘法表，倒数乘法表*/
        System.out.println("第一个");
        for (int num = 1;num<=9;num++){
            System.out.println(num+"*9="+num*9);
        }
        System.out.println("第二个");
        for (int num = 1; num<=9;num+=2){
            System.out.println(num+"*9="+num*9);
        }
        System.out.println("第三个");      //1，4，3，2，4，3，2，4，3，2，结束
        for (int num = 9;num>=1;num--){
            System.out.println(num+"*9="+num*9);
        }
        System.out.println("第四个");
    }
}
