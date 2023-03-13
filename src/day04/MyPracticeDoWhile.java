package day04;

import java.util.Scanner;

public class MyPracticeDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random()*1000+1);
        System.out.println("看一下生成的数"+num);
        int userInput;
        do{
            userInput =scanner.nextInt();
            if(userInput>num){
                System.out.println("大了");
            }else if(userInput<num){
                System.out.println("小了");
            }else {
                System.out.println("对了");
            }
        }while (userInput!=num);
    }
}
