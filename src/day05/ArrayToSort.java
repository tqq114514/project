package day05;

import java.util.Arrays;

public class ArrayToSort {
    public static void main(String[] args) {
        /*数组排序：生成数组赋值，调用arrays.sort排序，正着重新输出，反着重新输出*/
        int [] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*100);
            System.out.println(arr[i]);
        }
        System.out.println();

        Arrays.sort(arr);      //升序排序

        for(int i=0;i<arr.length;i++){     //正在输出
            System.out.println(arr[i]);
        }

        System.out.println();
        for (int i=arr.length-1;i>=0;i--){   //倒着输出
            System.out.println(arr[i]);
        }

        System.out.println();
        System.out.println(arr[0]);  //只是倒着输出，数据存储没有发生改变

    }
}
