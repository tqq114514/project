package collectionp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/*利用Java提供的sort方法，对人名进行排序，输出默认排序结果*/
public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("rose");
        list.add("tom");
        list.add("jerry");
        list.add("black");
        list.add("Kobe");
        System.out.println(list);
        /*利用工具类Collections里的sort()方法进行排序*/
        Collections.sort(list);
        System.out.println(list);
        /*默认按照首字母的ASCII码大小进行比较，若相同，则比较下一个字母*/
    }
}
