package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println("list:"+list);

        //E get(int index),获取指定下标所对应的元素
        String e = list.get(3);
        System.out.println(e);

        //E set(int index, E  e),更改指定下标的元素，返回被改掉的数字
        String old = list.set(0,"oneone");
        System.out.println(old);
        System.out.println(list);

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        for(String str :list){
            System.out.println(str);
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println();

        String s = list.remove(2);  //删除指定位置的元素并返回
        System.out.println("List:"+list);
        System.out.println(s);
        System.out.println();

        list.add(2,"insertElement");
        System.out.println("List:"+list);
        System.out.println();




    }
}
