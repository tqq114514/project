package day04;

import java.util.Scanner;

public class Guessing {          //猜数小游戏
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*1000+1); //random范围：0.0~0.99999999 -> 0.0~999.999999 -> 1.0~1000.99999999 强转int舍去所以小数
        System.out.println("作弊看一下生成的数："+num1);
        Scanner scanner = new Scanner(System.in);
        int guess ;   //重复一三项操作,初始化代码和改变代码相同，则可使用do while
        do{
            System.out.println("请猜数");
            guess = scanner.nextInt();
            if(guess>num1){
                System.out.println("猜大了，继续猜");
            }else if (guess<num1){
                System.out.println("猜小了，继续猜");
            } else {
                System.out.println("猜对了");
            }
        }while (guess!=num1);

        /*int num= 250;
        System.out.println("请猜数：");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        while (guess!=num1){   //猜数这个操作需要执行多次，所以需要用循环，有两个结果猜对或者是猜错，猜对跳出，猜错进入循环
            if(guess>num1){
                System.out.println("猜大了，继续猜");
                guess = scanner.nextInt();
            }else {
                System.out.println("猜小了，继续猜");
                guess = scanner.nextInt();
            }
        }
        System.out.println("恭喜你猜对了！");*/

    }
}
