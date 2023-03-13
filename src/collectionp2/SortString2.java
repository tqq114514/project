package collectionp2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortString2 {
    public static void main(String[] args) {
        /*利用自定义排序规则对人名进行排序，使用lambda进行简化*/
        List<String> list = new ArrayList<>();
        list.add("王克晶");
        list.add("传奇aff112");
        list.add("国斌老师");
        System.out.println(list);  //原始数据
        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length(); //利用名字的长度进行升序排序
            }
        });*/
        //lambda表达式简化后
        list.sort((String o1, String o2) ->  o1.length()-o2.length()); //利用名字的长度进行升序排序);
        System.out.println(list); //排序后

    }
}
