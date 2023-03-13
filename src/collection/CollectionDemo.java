package collection;
/*集合常见方法*/
import collectionp.Point;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection c =new ArrayList();
       Point p  = new Point(3,8);
       c.add(p);    //将p的引用装到了c中
        System.out.println(c);
        System.out.println(p);

        p.setX(100);
        System.out.println(c);    //由于是对象的引用，改变P，C也会改变
        System.out.println(p);







        /*Collection c = new ArrayList();
        c.add(new Point(2,3));
        c.add(new Point(5,8));
        c.add(new Point(1,4));
        c.add(new Point(3,2));
        c.add(new Point(2,3));
        System.out.println(c);
        *//*默认输出[元素1.toString(),元素2.toString(),元素3.toSting()]
        * 需要重写Object中的toString()*//*

        *//*boolean contains(Object o);
        判断当前集合是否包含元素o
        利用equals()进行比较
        比较的是不是地址，必须重写equals()*//*
        Point p = new Point(2,3);
        boolean flag = c.contains(p);
        System.out.println("是否包含"+flag);


        boolean flag1 = c.remove(p);
        System.out.println(c);*/








        /*Collection c = new ArrayList();
        c.add(123);
        c.add(4);
        c.add(56789);
        c.add("abc");
        System.out.println(c);
        System.out.println("集合元素个数"+c.size());
        System.out.println("集合是否清空"+c.isEmpty());
        *//*清空集合*//*
        c.clear();
        System.out.println(c);*/
    }
}
