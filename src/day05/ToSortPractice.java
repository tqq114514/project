package day05;

import java.util.Arrays;

public class ToSortPractice {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        for(int i=0;i<array1.length;i++){
            array1[i] = (int) (Math.random()*100+1);
            System.out.println(array1[i]);
        }
        System.out.println();

        //对该数组进行升序，进行正向输出
        Arrays.sort(array1);
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        System.out.println();

        //反向输出，但实际存放内存位置不变
        for (int i=9;i>=array1.length-10;i--){
            System.out.println(array1[i]);
        }
    }
}
