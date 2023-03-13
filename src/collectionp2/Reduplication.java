package collectionp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/*去重，利用两种集合的特点将ArrayList套入hashset中*/
public class Reduplication {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        c.add("one");
        c.add("two");
        System.out.println(c);
        Set<String> set = new HashSet<>();
        set.addAll(c);
        System.out.println(set);


    }
}
