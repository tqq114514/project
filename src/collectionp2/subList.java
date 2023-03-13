package collectionp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class subList {
    public static void main(String[] args) {
        /*subList()获取list集*/
        /*1、生成0-90十个数
        * 2、输出
        * 3、获取下标3-7的子集
        * 4、将子集元素都扩大十倍
        * 5、观察原list集合
        * 6、改变原集，观察子集
        * 7、原集合修改长度后，子集不能进行任何操作（包括输出子集），报错，必须重新输出子集*/
        Random random  =new Random();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i*10);
        }
        System.out.println(list);
        List<Integer> subList = list.subList(3,8);
        System.out.println(subList);
        for (int i =0;i<subList.size();i++){
            subList.set(i,subList.get(i)*10);
        }
        System.out.println(subList);
        System.out.println(list);
        list.set(3,30000000);
        System.out.println(list);
        System.out.println(subList);

        //原集合长度修改之后，子集将不能再进行任何操作，操作就发生异常，但是可以重新获取子集
        list.remove(9);
        System.out.println(subList);



    }
}
