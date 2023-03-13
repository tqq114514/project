package collection;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*增强for循环，新循环*/
public class NewForDemo {
    public static void main(String[] args) {
        String[] array = new String[]{"one,two,three,four,five"};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for (String s : array) {
            System.out.println(s);
        }
        Collection  c = new ArrayList();
        c.add(123);
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        Iterator it = c.iterator();
       /* while (it.hasNext()){
            *//*Object o  = it.next();*//*
            String str = (String) it.next();
            System.out.println(str);
        }*/
        for (Object o : c){
            System.out.println(o);
        }
        /*单纯展示元素时使用*/
    }
}
