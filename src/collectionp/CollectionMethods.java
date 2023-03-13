package collectionp;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
    public static void main(String[] args) {
        Collection c =new ArrayList<>();
        /*向集合中添加元素*/
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        System.out.println(c);
        Collection c1 =new ArrayList<>();
        c1.add("one");
        c1.add("two");
        /*集合的元素个数*/
        System.out.println(c.size());
        /*集合是否为空*/
        Boolean flag = c.isEmpty();
        System.out.println(flag);
        /*清空集合*//*
        c.clear();*/
        System.out.println(c);
        /*判断集合中是否包含了某元素*/
        Point p = new Point(3,4);
        boolean contains = c.contains(p);
        System.out.println("是否包含:"+contains);
        Point p1 = new Point(1,2);
        c.remove(p1);
        System.out.println(c);
        c.remove("one");
        System.out.println(c);


    }
}
