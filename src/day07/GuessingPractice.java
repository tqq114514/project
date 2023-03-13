package day07;

import java.util.Scanner;

/*猜数游戏，自造死循环,猜对为止，或者顾客点完餐为止，跳出，适用于商店，食堂的菜单，需要返回输出*/
/*需要输入1~100整数*/
public class GuessingPractice {
    public static void main(String[] args) {
        //生成一个随机数，用户输入数字，进行判断
        Scanner scanner = new Scanner(System.in);
        int num = (int) (Math.random()*100+1);
        System.out.println("请猜数：");
        while (true){
            int guess = scanner.nextInt();
            if(guess>num){
                System.out.println("大了，继续猜");
            }else if(guess<num){
                System.out.println("小了，继续猜");
            }else {
                System.out.println("恭喜你，猜对了");
                break;
            }
        }
    }
}
