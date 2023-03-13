package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPoint {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(3,4));
        list.add(new Point(6,9));
        list.add(new Point(7,8));
        list.add(new Point(1,3));
        System.out.println("list原始数据："+list);
        /*自己需要用到排序规则，不要去类中实现对象的比较方法，用匿名内部类重写规则即可
        * 不然维护麻烦*/
        /*Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()* o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2;
            }
        });*/
        /*lambda*/
        list.sort(( o1,  o2) -> o1.getX()-o2.getX());
        System.out.println(list);

    }
}
