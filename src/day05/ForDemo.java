package day05;

public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1;i<=100;i+=1){
            sum = sum + i;
        }
        System.out.println("sum:"+sum);
        System.out.println("\n");
        //for什么都不写是死循环
        /*for(;;){
            System.out.println("死循环");
        }*/
        //for 第二要素不能为逗号，其他可以有两项
        //break 在某种特定情况下提前结束程序
        for (int num=1;num<=9;num++){
            if (num==4){     //到四时就不输出后面的内容
                break;    //跳出程序
            }
            System.out.println(num+"*9="+num*9);
        }
        System.out.println("\n");
        //跳过大循环体中剩余语句而进入下一次循环
        //输出9的乘法表，跳过不能被三整除的一项
        //更改jf条件即可实现同样效果
        for (int num=1;num<=9;num++){
            if (num%3==0){     //到四时就不输出后面的内容
                continue;    //跳出程序
            }
            System.out.println(num+"*9="+num*9);
        }
        System.out.println("\n");

        for (int num=1;num<=9;num++){
            if (num%3!=0){     //到四时就不输出后面的内容
                System.out.println(num+"*9="+num*9);
            }
        }
        System.out.println("\n");



    }
}
