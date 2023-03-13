package collectionp2;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("one");
        System.out.println(list);
        //E get(int index):获取指定下标所对应的元素
        String str = list.get(2);
        System.out.println(str);
        //将给定元素设置到指定位置，返回被替换的元素
        String reserve = list.set(0,"hello");
        System.out.println(reserve);
        System.out.println(list);
        list.remove(3); //把four拿走
        System.out.println(list);
        /*add操作是插入的意思*/
        list.add(4,"final");
        System.out.println(list);


    }
}
