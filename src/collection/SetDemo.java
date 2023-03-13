package collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        /*去重*/
        List<String> list = new ArrayList<>(); //set集，随机存放，且元素不可重复
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("two");
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);


    }
}
