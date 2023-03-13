package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<Item>(); // 购物车

        // 显示菜单
        System.out.println("欢迎来到购物商城，请选择商品：");
        System.out.println("1. 鞋子 - 300元/双");
        System.out.println("2. 衣服 - 400元/件");
        System.out.println("3. 手表 - 5000元/只");
        System.out.println("4. 结算");

        // 读取用户输入
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("请输入选项编号：");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("请输入购买数量：");
                    int num1 = scanner.nextInt();
                    cart.add(new Item("鞋子", 300, num1));
                    break;
                case 2:
                    System.out.print("请输入购买数量：");
                    int num2 = scanner.nextInt();
                    cart.add(new Item("衣服", 400, num2));
                    break;
                case 3:
                    System.out.print("请输入购买数量：");
                    int num3 = scanner.nextInt();
                    cart.add(new Item("手表", 5000, num3));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("无效的选项，请重新输入。");
            }
        } while (choice != 4);

        // 计算总金额和折扣
        int total = 0;
        for (Item item : cart) {
            total += item.getPrice() * item.getQuantity();
        }
        double discount = 1.0;
        if (total >= 500) {
            discount = 0.8;
        } else if (total >= 200) {
            discount = 0.9;
        }

        // 输出清单和总金额
        System.out.println("您的购物清单如下：");
        for (Item item : cart) {
            System.out.println(item.getName() + " x " + item.getQuantity() + "件 ，单价 " + item.getPrice() + "元/件");
        }
        System.out.println("总金额：" + total + "元");

        // 计算折后金额和找零
        int discountedTotal = (int) (total * discount);
        int paid;
        do {
            System.out.print("请输入付款金额：");
            paid = scanner.nextInt();
            if (paid < discountedTotal) {
                System.out.println("付款金额不足，请重新输入。");
            }
        } while (paid < discountedTotal);
        int change = paid - discountedTotal;
        System.out.println("折后金额：" + discountedTotal + "元");
        System.out.println("找零：" + change + "元");
    }

}

class Item {
    private String name; // 商品名称
    private int price; // 商品价格
    private int quantity; // 购买数量

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.getQuantity();
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

}

