package shopping;

import java.util.Scanner;

/**
 * V2.0版本（商品购物系统）：
 *      需求：提供用户选择菜单，
 *      用户可以选择商品，并添加到购物车，购物车进行商品结算，
 *      结算的过程，根据商品的总金额进行打折，
 *        满200打 9折 ，满500打8折，低于200不打折，
 *        最终输出找零的结果。
 *      技术：面向对象，变量，数据类型，
 *      if结果，Switch结构，循环结构，数组，运算符，方法。
 *      父类：
 *        商品类    Product
 *        商品的数量 count
 *        商品的价格 price
 *        商品的名称 name
 *      子类：
 *        具体的商品 Apple
 *        甜度   sweetness
 *
 *      购物车类：
 *         存储数据的容器   Product数组
 *         select 查看
 *         add    添加
 *         delete 删除
 *         sum    结算
 */
/*
public class ProductMain {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       memu();
    }

    public static void memu() {
        ShoppingCart carts = new  ShoppingCart(4);
        System.out.println("请您选择以下商品：");
        System.out.println("1：苹果   10   1000");
        System.out.println("2：香蕉   20   1");
        System.out.println("3：橙子   5    100");


        boolean flag = true;//循环条件
        do {
            int type = scanner.nextInt();
            //输入的商品标号
            //分支结构判断具体选择的是哪个商品
            switch (type) {
                case 1:
                    System.out.println("你选择的是苹果");
                    Apple apple = new Apple(7,"红富士",10,"很甜");
                   */
/* ShoppingCart.add(apple);*//*

                    break;
                case 2:
                    System.out.println("查看商品");
                    */
/*ShoppingCart.selectPro();*//*

                    break;
                case 3:
                    System.out.println("进行结算");
                    ShoppingCart.sumPro();
                    break;
                case 4:
                    System.out.println("您选择的是西瓜");
                    break;

                default:
                    System.out.println("选择的商品有误，是否重新输入Y/N？");
                    //提示输入，是否继续选择
                    String ch = sc.next();
                    //分支判断，Y就是继续，N就是结束，通过改变循环条件flag进行循环退出。
                    if("Y".equals(ch)){
                        flag = true;
                    }else {
                        flag = false;
                    }
                    break;

            }
        }while(flag);
    }
    }
*/
/*}*//*


*/
