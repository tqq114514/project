package string;

import java.util.ArrayList;

/*static String valueOf(数据类型a)
将其他数据类型转化为String
静态方法，需要通过类名点调用
* */
public class ValueOfDemo {
    public static void main(String[] args) {
        /*将整型转换为String类型*/
        int a = 100;
        String s = String.valueOf(100);
        System.out.println(s);
        /*将浮点型转换为String类型*/
        double b  = 100.123;
        String s2 = String.valueOf(b);
        System.out.println(s2);

        String s3 = b+"12";  //拼接方式转为字符串，效率低下，不推荐
        System.out.println(s3);

    }
}
