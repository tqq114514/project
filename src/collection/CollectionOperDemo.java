package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*集合间的操作*/
public class CollectionOperDemo {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("Java");
        c1.add("Python");
        c1.add("php");
        System.out.println("c1"+c1);
        Collection c2 = new ArrayList();
        c2.add("Android");
        c2.add("ios");
        System.out.println("c2"+c2);

        c1.addAll(c2);
        System.out.println("添加后c1为:"+c1);
        System.out.println("c2不变:"+c2);

        Collection c3 = new ArrayList();
        c3.add("Android");
        c3.add("windowsphone");
        c3.add("ios");
        boolean flag = c3.containsAll(c2);
        System.out.println(flag);  //必须包含所有的元素，才叫包含


       /* //取交集
        c1.retainAll(c3);
        System.out.println("c3"+c3);
        System.out.println("取交集后的c1"+c1);*/

        c1.removeAll(c2);
        System.out.println("删除共有部分后c1为："+c1);


    }
}
