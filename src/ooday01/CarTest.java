package ooday01;

public class CarTest {
    public static void main(String[] args) {
        Car carNull = new Car();
        carNull.brand = "奔驰";
        carNull.color = "白";
        carNull.price =  114514.778;
        carNull.start();
        System.out.println();
        carNull.run();
        System.out.println();
        carNull.stop();
        System.out.println();
        Car carParameter = new Car("保时捷","红",1500000.8234);
        carParameter.start();
        System.out.println();
        carParameter.run();
        System.out.println();
        carParameter.stop();
    }
}
