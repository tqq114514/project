package collectionp2;
/*集合的排序：整数，且必须为list集*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortInteger {
    public static void main(String[] args) {
        /*随机生成十个整数（0-100）,输出无序，升序，降序的结果*/
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i =0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);  //不排
        Collections.sort(list);
        System.out.println(list);  //升序
        Collections.reverse(list);
        System.out.println(list);  //降序

    }
}
