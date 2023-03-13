package test;

public class test3 {
    public static void main(String[] args) {
        int arr[]  = {10,9,1,20,19,30,5};
        int max = arr[0];
        int maxIndex = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
                maxIndex = i;
                System.out.println();
            }
        }
        System.out.println(max);
        System.out.println("最大元素下标为:"+maxIndex);
    }
}
