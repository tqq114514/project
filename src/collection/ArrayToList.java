package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        /*将数组转换为集合*/
        List<String> list = Arrays.asList(array);
        System.out.println("List:"+list);

        /*对数组进行修改，集合也修改*/
        array[1] = "six";
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("List:"+list);
        /*对集合进行修改，数组同步修改*/
        list.set(2,"modify");
        System.out.println("array:"+ Arrays.toString(array));
        System.out.println("List:"+list);

        /*list.add("!!!");*/



    }
}
