package binnary;

public class HexDemo {
    public static void main(String[] args) {
        /*16进制：由于缩写2进制
        * 0x是16进制字面量前缀
        * 0b为2进制字面量前缀
        * 计算机里面只有2进制，没有10和16进制
        * */
        int m = 0b0100_0111_1011_1001_1000_1010;
        int n = 0x47b98a;
        /*按二进制输出*/
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(n));
        /*按十六进制输出*/
        System.out.println(Integer.toHexString(m));
        System.out.println(Integer.toHexString(n));
        /*按10进制输出*/
        System.out.println(m);
        System.out.println(n);
        /*以0开头表示八进制，八进制不到8，权为，512，64，8，1*/
        int a = 067;
        /*以八进制输出*/
        System.out.println(Integer.toOctalString(m));
        System.out.println(Integer.toOctalString(n));
    }
}
