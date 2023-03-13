package day05;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for(int i=1;i<=10;i++){
            //出题，随机生成两个随机数
            int a = (int) (Math.random()*100+1);
            int b = (int) (Math.random()*100+1);
            int sum = a+b;
            System.out.println("("+i+")"+a+"+"+b+"="+"?");
            //用户输入答案
            System.out.println("请答题");
            int userInput = scanner.nextInt();
            //判断是否正确
            if(userInput == sum){
                System.out.println("答对了");
                score = score+=10;
            }else {
                System.out.println("答错了");
            }
        }
        System.out.println("成绩为："+ score);
    }
}
