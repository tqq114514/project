package string;
/*int indexof(String s);
* 从字符串中找到字符串第一次出现的位置*/
public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Thinking in java";
        int index = s.indexOf("in");  //检索in第一次出现的位置
        System.out.println(index);
        /*从下标3的位置开始找in第一次出现的位置*/
        int index1 = s.indexOf("in",3);
        System.out.println(index1);    //5,前面的不算，后面的开始以零计算
        /*字符串在str中不存在的情况*/
        int index2 = s.indexOf("aji");   //在字符串中找aji
        System.out.println(index2);   //-1
        /*检索in在str中最后出现的位置*/
        int index3 = s.lastIndexOf("in");
        System.out.println(index3);    //9
    }
}
