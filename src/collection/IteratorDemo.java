package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c =new ArrayList();
        c.add("123");
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        System.out.println(c);
        Iterator it = c.iterator();  //获取c的迭代器
        while (it.hasNext()){    //若有下一个元素
            String str = (String) it.next();  //获取下一个元素并强转为String
            /*System.out.println(it.next());*/
            System.out.println(str);  //取出
            if("#".equals(str)){   //删除带#的
                it.remove();
            }
        }
        System.out.println(c);
    }
}
