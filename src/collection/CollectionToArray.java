package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArray {
    public static void main(String[] args) {
        Collection<String>  c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);

        String[] arrays =  c.toArray(new String[c.size()]); //将集合转换为数组
        System.out.println(Arrays.toString(arrays)); //将字符串数组以字符串形式输出

    }
}
