package string;

import java.util.Arrays;

/*String[] split(String regex);
  将当前字符串按照满足正则表达式（regex）的部分进行拆分，将拆分剩下的以String[]的形式返回
* */
public class splitDemo {
    public static void main(String[] args) {
        String line = "1at12jofyujstdd23ey1";
        String[] data = line.split("[0-9]+");
        System.out.println(Arrays.toString(data));

        String line2 = "20.197.183.106";
        String[] data1  = line2.split("\\.");
        System.out.println(Arrays.toString(data1));

        /*最开始就是可拆分项，
        * 中间是可拆分项
        * 尾巴是可拆分项*/
        line =".123.456..78........";
        String[] data3 =  line.split("\\.");
        System.out.println(Arrays.toString(data3));

        /*https://search.bilibili.com/all?keyword=test&from_source=webtop_search&spm_id_from=333.851
        * keyword=test
        * from_source=webtop_search
        * spm_id_from=333.851
        * split可以解析拆分Url*/


    }

}
