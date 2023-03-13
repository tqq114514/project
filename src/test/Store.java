package test;

import java.util.*;

public class Store {
    // 商品列表
    private static Map<String, Integer> items = new HashMap<>();
    static {
        items.put("apple", 10);
        items.put("banana", 15);
        items.put("orange", 12);
        items.put("pear", 8);
    }

    // 购物车
    private static Map<String, Integer> cart = new HashMap<>();

    // 显示菜单
    private static void showMenu() {
        System.out.println("Welcome to our store! Here is the menu:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    // 添加商品到购物车
    private static void addToCart(String item, int qty) {
        if (items.containsKey(item)) {
            cart.put(item, cart.getOrDefault(item, 0) + qty);
            System.out.println(qty + " " + item + " added to your cart.");
        } else {
            System.out.println("Sorry, we don't have " + item);
        }
    }

    // 计算总价
    private static int calculateTotal() {
        int total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += items.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    // 打折
    private static int applyDiscount(int total) {
        if (total >= 500) {
            return (int) (total * 0.8);
        } else if (total >= 200) {
            return (int) (total * 0.9);
        } else {
            return total;
        }
    }

    // 结算
    private static void checkout(int payment) {
        int total = calculateTotal();
        System.out.println("Total price: " + total);
        total = applyDiscount(total);
        System.out.println("Discounted price: " + total);
        int change = payment - total;
        if (change >= 0) {
            System.out.println("Thank you for shopping with us. Your change is " + change);
        } else {
            System.out.println("Sorry, you don't have enough money to pay.");
        }
    }

    public static void main(String[] args) {
        showMenu();
        addToCart("apple", 2);
        addToCart("banana", 1);
        addToCart("pear", 3);
        int total = calculateTotal();
        System.out.println("Total price: " + total);
        total = applyDiscount(total);
        System.out.println("Discounted price: " + total);
        checkout(50);
        checkout(100);
        checkout(200);
        checkout(500);
        checkout(1000);
    }
}