package ooday05;

public class GetterSetterDemo {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(100);
        point.setY(200);
        int m = point.getX();
        int n = point.getY();
        System.out.println(m+","+n);


    }
}
