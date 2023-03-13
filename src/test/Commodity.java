package test;

import java.util.Scanner;

public class Commodity {   /*Array.copyof*/
    public static void main(String[] args) {
        /*商品购物系统，提供用户选择菜单，用户可以选择商品，添加到购物车，购物车进行商品结算
         * 结算的时候给顾客打折，满500打8折，满200打9折，低于200不打折，最终输出找零的结果
         * 使用变量、数据类型、if结构、Switch结构、循环结构、数组、运算符、方法*/
        Scanner scanner = new Scanner(System.in);
        String[] items = new String[]{"苹果","可乐","方便面","啤酒","花生"};
        int[] prices = new int[]{8,3,4,4,7};   //商品价格单位：份
        int[] amounts = new int[7];   //买的数量
        int sum1=0;  //结算时应付价格
        System.out.println("欢迎来到商品购物系统！");
        System.out.println("以下是我们的菜单：");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d. %s（%d元/份）\n", i + 1, items[i], prices[i]);
        }

        while (true) {
            System.out.println("请输入你要购买的商品编号（输入0结束购买）：");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice < 1 || choice > 5) {
                System.out.println("无效的商品编号，请重新输入！");
                continue;
            }
            System.out.println("请输入你要购买的数量（单位：斤）：");
            int amount = scanner.nextInt();
            amounts[choice - 1] += amount;
            System.out.printf("已将%d斤%s添加到购物车中！\n", amount, items[choice - 1]);

        }

        System.out.println("以下是你的购物车清单：");
        for (int i = 0; i < items.length; i++) {
            if (amounts[i] > 0) {
                System.out.printf("%s：%d斤（%d元/斤）\n", items[i], amounts[i], prices[i]);
                sum1 += amounts[i] * prices[i];
            }
        }
        sum1 = discount(sum1);
        System.out.println();
        System.out.println("请支付"+sum1+"元");
    }
    public static int discount(int sum){  //打折的方法
        if(sum>=500){
            sum*=0.8;
        }else if(sum>=200){
            sum*=0.9;
        }else{
        }
        return sum;
    }
    /*先整理思路，再搭框架，再填充*/
}
