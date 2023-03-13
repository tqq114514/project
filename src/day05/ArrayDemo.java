package day05;

public class ArrayDemo {
    public static void main(String[] args) {
        /*引用数据类型，是相同数据类型的集合
        * 声明方法int[] b=; 整型数组
        * double[] c;
        * long[] d;
        * 给引用类型赋值需要用new*/
        int[] a = new int[8];   //该数组可以装8个数,每个元素都是int型，8个元素都被赋予默认值0
        /*数组中元素的初始化*/
        double[] b = new double[3];  //使用默认值初始化
        int [] arr2 = {1,2,3};  //用大括号必须声明直接给值，不能分开
        double [] arr3 = new double[]{2.3,2.5,8.8};//中括号中不能给值
        double[] arr4 ;
        arr4 = new double[]{1.6,3.8,7.75767};
        boolean [] array5 = new boolean[]{true,false,false};
        char [] array6 = {'拉','4','%'};
        byte[] array7 = new byte[10];
        /*通过下标/索引来访问元素，下标从0开始，最大到数组长度减一*/
        System.out.println("数组的长度"+array7.length);
        System.out.println("第一个元素"+array7[0]);
        array7[0] = 127;  //给第一个数字赋值
        array7[9] = 100;   //给第八个数字赋值
        array7[7] = -128;
        /*array7[2] = 100.2;*/
        /*array7[10] = 112;*/ //数组越界异常，运行时异常
        System.out.println(array7[array7.length-1]);
        /*System.out.println(array7[10]);*/
        System.out.println(array7[array7.length-3]);
        //数组的遍历，数组的长度不要写死
        int [] arr8 = new int[10];
        for(int i = 0; i<arr8.length;i++){  //遍历数组，并给每个元素赋值100并输出
           /* arr8[i] = 100;*/
            arr8[i] = (int) (Math.random()*100+1);  //给数组中的元素赋值1~100的随机数
            System.out.println("arr8["+i+"]="+arr8[i]);
        }
    }
}
