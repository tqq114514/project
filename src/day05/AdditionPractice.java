package day05;

import java.util.Scanner;

public class AdditionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        for(int i=1;i<=10;i++){
            int a = (int) (Math.random()*100+1);  //生成一个1~100的值
            int b = (int) (Math.random()*100+1);
            int result = a+b;
            /*System.out.println("生成的正确答案是："+result);*/
            System.out.println("("+i+")"+a+"+"+b+"=?");
            int userInput = scanner.nextInt();
            if(userInput==result){
                System.out.println("猜对了");
                score += 10;
            }else {
                System.out.println("猜错了");
            }
        }
        System.out.println("你的成绩为"+score);
    }
}
