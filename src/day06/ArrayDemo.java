package day06;

public class ArrayDemo {
    public static void main(String[] args) {
        /*数组的复制*/
        int [] arr0 = {12,895,4,656,12,891,1};
        int [] arr1 = new  int[5];
        System.arraycopy(arr0,1,arr1,2,3);
        /*0，0，895，4，656
        原数组
        * 原数组下标
        * 目标数组
        * 目标数组下标
        * 复制的数组长度*/
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
