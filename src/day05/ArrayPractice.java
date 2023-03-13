package day05;

public class ArrayPractice {
    public static void main(String[] args) {
        double[] array0 = new double[]{12.5,56.48,64.0};
        int[] array1 = new  int[10];
        boolean[] array2 = {true, false, true};
        char [] array3 ;
        array3 = new char[]{'哈','你','y'};
        System.out.println(array3.length);  //array3长度
        array3[0] = 'a';
        array3[1] = 'b';
        array3[2] = 'c';
        System.out.println(array3[array3.length-1]); //array3最后一位的数值
        //遍历数组，给每个数组赋1~100随机数，输出每个元素的值
        for (int i=0;i<array1.length;i++){
            array1[i] = (int)(Math.random()*100+1);
            System.out.println(array1[i]);
        }
    }
}
