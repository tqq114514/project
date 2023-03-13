package day05;

public class RightTriangle {
    public static void main(String[] args) {
        for (int i=1;i<=6;i++){
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
