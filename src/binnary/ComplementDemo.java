package binnary;

public class ComplementDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Integer.toBinaryString(-1));

        int fushu = -45;
        System.out.println(Integer.toBinaryString(fushu));  //32位全1是-1，-1减去0对应位置的权是负数二进制的值
        System.out.println(fushu);
    }
}
