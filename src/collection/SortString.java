package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*对字符串进行排序，对英文字符串排序，会按首字母ASCII码来排序
* 首字母相同，比较第二个字母的ASCII值*/
public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王克晶");
        list.add("传奇123aa");
        list.add("国兵");
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               *//* 返回值大于0，表达式o1>o2,交换他们的位置，
                * 是升序*//*
                return o1.length()-o2.length();   //按长度升序
               *//* return o2.length()-o1.length();*//*   //长度降序
            }
        });*/
        Collections.sort(list, ( o1,  o2) -> o1.length() - o2.length());
        System.out.println(list);








        /*List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("rose");
        list.add("tom");
        list.add("jerry");
        list.add("black");
        list.add("Kobe");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("排序完成后的为："+list);*/


    }
}
