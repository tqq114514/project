package collectionp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/***通过迭代器和新循环遍历集合,,问，取，删***/
public class Iterator1 {
    public static void main(String[] args) {
        Collection c = new ArrayList<>();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("three");
        System.out.println(c);
        /*获取迭代器*/
        java.util.Iterator it = c.iterator();
        while (it.hasNext()){
            String str = (String) it.next();
            System.out.println(str);
            if("#".equals(str)){
               it.remove();
            }
        }
        System.out.println(c);

        for(Object o : c){
            System.out.printf("%s,",o);
        }
    }
}
