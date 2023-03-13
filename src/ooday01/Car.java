package ooday01;

public class Car {
    String brand;
    String color;
    double price;
    Car(){
    }
    Car(String brand ,String color ,double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    void start(){
        System.out.printf("%s牌子的%s颜色的%.2f价格的车车启动了",this.brand,color,price);
    }
    void run(){
        System.out.printf("%s牌子的%s颜色的%.2f价格的车车在跑了",brand,color,price);
    }
    void stop(){
        System.out.printf("%s牌子的%s颜色的%.2f价格的车车停车了",brand,color,price);
    }
}
