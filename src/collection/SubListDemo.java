package collection;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i =0;i<10;i++){
            list.add(i*10);  //0,10,20,30,40,50,60,70,80,90
        }
        System.out.println(list);

        List<Integer> list1 = list.subList(1,6);
        System.out.println(list1);

        /*子集扩大十倍*/
        for (int i= 0;i<list1.size();i++){
            list1.set(i,list1.get(i)*10);
        }
        System.out.println(list1);

        /*对子集的操作就是对原集合的元素的操作*/
        System.out.println(list);
        /*改变原集合，子集元素也修改*/
        list.set(1,1000);
        System.out.println(list1);


        System.out.println(list);
        list.remove(4);  //把400拿走
        System.out.println(list);
        /*System.out.println(list1);*/  //同时修改异常，原集合长度改变后，子集不能再有任何操作，操作就
        /*发生异常，必须重新获取子集*/





    }
}
