package stringtrainning;
/*
* 找出字符串中给定字符串的下标（第一次出现的位置和最后一次出现的位置）*/
public class IndexOfAndLastIndexOf {
    public static void main(String[] args) {
        String str = "Thinking in Java";
        //从下标为4的位置开始找in第1次出现的位置
        int index = str.indexOf("in",4);  //排除4之前的下标为5
        System.out.println(index);
        /*检索in在str中第1次出现的位置*/
        int index1 = str.indexOf("in");
        System.out.println(index1);  //2
        //若字符串在str中不存在，则返回-1
        int index2 = str.indexOf("in",30);
        System.out.println(index2);  //-1
        //检索in在str中最后一次出现的位置
        int index3 = str.lastIndexOf("in");
        System.out.println(index3);  //9
        int index4 = str.lastIndexOf("in",4);
        System.out.println(index3);  //9



    }
}
