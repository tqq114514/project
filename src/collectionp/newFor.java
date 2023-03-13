package collectionp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class newFor {
    public static void main(String[] args) {
        String[] strings = {"one","two","three"};
        for (int i =0;i<strings.length;i++){
            System.out.printf("%s\t",strings[i]);
        }
        System.out.println();
        for (String str :strings){
            System.out.printf("%s\t",str);
        }
        System.out.println();

        Collection c =new ArrayList();
        c.add("123");
        c.add("three");
        c.add("four");
        Iterator it = c.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.printf("%s\t",s);
        }
        System.out.println();
        for (Object o :c){
            System.out.printf("%s\t",o);
        }


    }
}
