package day04;

import java.util.Scanner;

public class MyPracticeGuessWhile {
    public static void main(String[] args) {
        //while 猜数小游戏
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random()*1000+1);  //0.0~0.9999999
        System.out.println("偷看一下生成的数字"+num);
        System.out.println("请输入1~1000整数:");
        int guessInput = scanner.nextInt();
        while (guessInput!=num){
            if(guessInput>num){
                System.out.println("你输入的数字太大了");
            }else {
                System.out.println("你输入的数字太小了");
            }
            System.out.println("请重新输入：");
            guessInput = scanner.nextInt();
        }
        System.out.println("你猜对了");
    }
}
