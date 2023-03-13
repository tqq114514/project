package binnary;

public class BinaryDemo {
    public static void main(String[] args) {
        int i = 87;    //高位省略0，输出二进制
        String ii = Integer.toBinaryString(i);
        System.out.println(ii);
        //直接输出
        System.out.println(i);
        i++;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i);


    }
}
