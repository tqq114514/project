package stringandintegerpractice;

import java.util.Arrays;

/*split(),利用正则表达式去除数字，剩余的输出，返回字符串数组*/
public class SplitPractice {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String[] dataReturn = line.split("[0-9]+"); //一次要去除1个或以上，不加则一个个去除
        System.out.println(Arrays.toString(dataReturn));

        String ipAddress = "20.187.100.115";
        String[] ip = ipAddress.split("\\.");
        System.out.println(Arrays.toString(ip));

        //最开始就是可拆分项，那么数组第1个元素为空字符串-----------------""
        //如果连续两个(两个以上)可拆分项，那么中间也会拆出一个空字符串------""
        //如果末尾连续多个可拆分项，那么拆出的空字符串被忽略(不要了)
        String line1 = ".123.456..78........";
        String[] str = line1.split("\\.");
        System.out.println(Arrays.toString(str));

    }
}
