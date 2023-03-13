package collection;

import java.util.*;

/*集合的排序：整数，且必须为list集*/
public class SortInteger {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i<10;i++){
            list.add(random.nextInt(10));  //生成范围0~10的数
        }
        System.out.println("生成的集合为："+list);  //无序
        Collections.sort(list);
        System.out.println("排序后的集合为："+list); //有序，升序
        Collections.reverse(list);
        System.out.println("反转后的集合为："+list);
        System.out.println("最后一个元素为："+list.get(9));

    }
}
