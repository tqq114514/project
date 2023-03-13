package collectionp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("Java");
        c.add("Python");
        c.add("php");
        Collection<String> c1 = new ArrayList<>();
        c1.add("C++");
        c1.add("C#");
        Collection<String> c2 = new ArrayList<>();
        c2.add("Python");
        c2.add("php");
        Collection<String> c3 = new ArrayList<>();
        c3.add("Python");
        c3.add("php");
        c3.add("C++");
        c.addAll(c1);  //c:[Java,Python,php,C++,C#]
        System.out.println(c);
        boolean flag = c.containsAll(c2);  //判断当前集合中是否包含目标集合所有元素
        System.out.println(flag); //true
        c.retainAll(c1);  //取交集，c中只保留相同部分
        System.out.println(c1);
        c3.removeAll(c1);  //移除共有部分
        System.out.println(c3);
        c3.addAll(c1);
        System.out.println(c3);

    }
}
