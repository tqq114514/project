package day04;


import java.util.Scanner;

public class MyPracticeSwitch {
    public static void main(String[] args) {
        //银行存取款转账交易1、转账2、取款3、存款4、退卡
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字以确定你要办理的业务：");
        int command = scanner.nextInt();
        switch (command){
            case 1:
                System.out.println("转账业务");
                break;
            case 2:
                System.out.println("取款业务");
                break;
            case 3:
                System.out.println("存款业务");
                break;
            default:
                System.out.println("退卡");
        }
    }
}
