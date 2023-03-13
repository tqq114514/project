package day07;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        /*猜数游戏，自造死循环，跳出，适用于商店，食堂的菜单，需要返回输出*/
        Scanner scanner = new Scanner(System.in);
        /*生成随机数*/
        int num = (int) (Math.random()*100+1);
        System.out.println("正确答案是"+num);

        while (true){
            System.out.println("请猜数，需要输入1~100整数");
            int guess = scanner.nextInt();
            if(guess>num){
                System.out.println("大了");
            }else if(guess<num){
                System.out.println("小了");
            }else {
                System.out.println("猜对了");
                break;
            }
        }

    }
}
