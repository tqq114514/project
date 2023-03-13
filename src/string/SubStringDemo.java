package string;
/*截取字符串*/
public class SubStringDemo {
    public static void main(String[] args) {
        String test = "www.tedu.cn";
        int start = test.indexOf(".")+1;
        int end = test.lastIndexOf(".",start);
        String s = test.substring(start,end); //要头不要尾
        System.out.println(s);
        /*基于位置的截取*/
    }
}
