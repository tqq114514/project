package day06;

import java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int [] array1= new int[10];
        for(int i=0;i<array1.length;i++) {
            array1[i] = (int) (Math.random() * 100);  //生成0~99的值
            System.out.println("array[" + i + "]=" + array1[i]);
        }
        int max = array1[0];    //假设第一个数为最大值
        for(int i = 1;i<array1.length;i++){  //遍历所有剩余元素，第一个元素不要遍历
            if (array1[i]>max){    //剩余元素比max大，就把max修改为其值
                max = array1[i];
            }
        }
        System.out.println("最大值为："+max);
        array1 = Arrays.copyOf(array1,array1.length+1);   //对数组扩容1位，并将最大值放到最后
        array1[array1.length-1] = max;
        System.out.println("修改后的数组为：");
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
    //晶姐讲Java

}
