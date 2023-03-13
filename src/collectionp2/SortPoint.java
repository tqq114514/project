package collectionp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPoint {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,7));
        list.add(new Point(9,7));
        list.add(new Point(2,6));
        list.add(new Point(8,2));
        list.add(new Point(6,5));
        System.out.println(list);
        /*使用匿名内部类，以使该方法只供自己使用，不允许重写接口中的方法*/
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();  //根据点距离坐标远点的距离进行排序
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2;
            }
        });
        System.out.println(list);
        /*利用lambda表达式对以上代码进行优化*/
        Collections.sort(list, (o1, o2)-> {
                int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();  //根据点距离坐标远点的距离进行排序
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2;
        });
        System.out.println(list);

        /*public interface Comparator<T>
        * lambda要求是函数式接口，接口中要求类必须重写的接口只能是一个*/
        /*语法(参数列表)->{
        * 方法体
        * }*/

    }
}
