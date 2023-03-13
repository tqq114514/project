package day06;

import java.util.Arrays;

public class MaxOfArrayTraining {
    public static void main(String[] args) {
        /*生成10个随机数并赋值
        求出最大值
        扩容数组
        将最大值置于最后
        * */
        int [] array0 = new int[10];
        for (int i=0;i<array0.length;i++){
            array0[i] = (int) (Math.random()*100+1);
            System.out.print(array0[i]+"\t");
        }
        System.out.println();
        int max = array0[0];
        for(int i =1;i<array0.length;i++){
            if(array0[i]>max){
                max = array0[i];
            }
        }
        int [] array2 = Arrays.copyOf(array0,array0.length+1);
        array2[array2.length-1] = max;
        for (int i =0;i<array2.length;i++){
            System.out.print(array2[i]+"\t");
        }
    }
}
