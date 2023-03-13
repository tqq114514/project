package collection;

import collectionp.Point;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(123);
        c.add(789);
        /*c.add("one");*/  //"one"的类型违背了集合c所指向的泛型的实际类型Interger
        /*迭代器所指定的类型应与集合所遍历的类型一致*/
        Iterator<Integer> it =  c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (int i : c){
            System.out.println(i);
        }
        System.out.println();

        Collection<Point> c1 = new ArrayList<>();
        c1.add(new Point(1,2));
        c1.add(new Point(3,4));
        c1.add(new Point(5,6));
        c1.add(new Point(7,8));
        System.out.println(c1);
        Iterator<Point> it1 = c1.iterator();
        while (it1.hasNext()){
            Point str = it1.next();
            System.out.println(str);
        }
        for (Point p : c1){
            System.out.println(p);
        }



    }
}
