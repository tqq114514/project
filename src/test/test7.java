package test;

public class test7 {
    public static void main(String[] args) {
        int[] array = new int[]{30,7,11,6,2};

        // 冒泡排序
        for (int i = 0; i < array.length - 1; i++) {  //控制比较轮数
            for (int j = 0; j < array.length - i - 1; j++) {   //比较相邻元素并交换
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        // 遍历结果集
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
