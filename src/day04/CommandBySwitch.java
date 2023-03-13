package day04;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择功能：1、存款 2、取款 3、转账 4、退出");
        int command = scanner.nextInt();
/*        if(command==1){
            System.out.println("存款业务");
        }else if(command==2){
            System.out.println("取款业务");
        }else if (command==3){
            System.out.println("转账业务");
        }else  if(command==4){
            System.out.println("退卡成功");
        }else {
            System.out.println("输入错误");
        }*/

        //switch case 只能适合整数，字符串，枚举，且不适用于范围，只能等于,
        //具有贯穿的效果
        //必须配合break,跳出下面的步骤
        switch (command) {  //可以说byte,short,int,char,String,枚举
            case 1:
                System.out.println("存款业务");
                break;
            case 2:
                System.out.println("取款业务");
                break;
            case 3:
                System.out.println("转账业务");
                break;
            case 4:
                System.out.println("退卡成功");
                break;
            default:
                System.out.println("输入错误"); //先配case，最后才会配default
        }



    }
}
