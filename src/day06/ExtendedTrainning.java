package day06;

public class ExtendedTrainning {
    public static void main(String[] args) {
          int[] array1 = new  int[10];
          for (int i=0;i<array1.length;i++){
              array1[i] = (int)(Math.random()*101);  //0~100
              System.out.print(array1[i]+"\t");
          }
          int max = getMaxOfArray(array1);
          System.out.println("数组的最大值为："+max);
    }
    private static int getMaxOfArray(int[] array){
        int max = array[0];
        for (int i=0;i<array.length-1;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
