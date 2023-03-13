package day05;


import java.util.Arrays;

public class MaxOfArrayPractice {
    public static void main(String[] args) {
        /*初始化十个元素的数组，遍历并给每个元素赋值0~99的随机数并输出，找到数组元素最大值并输出*/
        int [] array1 = new int[10];
        for (int i=0;i<array1.length;i++){
            array1[i] = (int)(Math.random()*99);
            System.out.println(array1[i]);
        }
        System.out.println();
        /*求该数组中的最大数*/
        int max = array1[0];
        for (int i=1;i<array1.length;i++){
            if(array1[i]>max){
                max = array1[i];
            }
        }
        System.out.println(max);
        System.out.println();




    }
}
