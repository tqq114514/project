package map;
/*Java.Util.Map
* Map是java集合框架的一员，但没有实现Collection接口
* Map的结构是多行两列
* HashMap:使用散列算法实现的Map，称为散列表，不是线程安全的，Hashtable是线程安全的，但不常用
* TreeMap：使用二叉树算法实现的Map*/

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        /*HashMap<String,Integer> map = new LinkedHashMap<>();  //有序输出map*/
        map.put("语文",100);
        map.put("数学",99);
        Integer i = map.put("英语",150);
        System.out.println(i);
        System.out.println(map);
        /*不要使用int接受，会导致空指针异常*/

        Integer value = map.put("数学",50);  //返回被替换的值
        System.out.println(value);
        System.out.println(map);

        Integer value1 = map.get("体育");
        System.out.println("体育"+value1);  //给定的key不存在，则返回null
        Integer value2 = map.get("语文");
        System.out.println("语文"+value2);

        int size = map.size();   //返回map中元素个数，每个键值对算一个元素
        System.out.println("size:"+size);

        /*remove(Object key) */
        map.remove("语文");
        System.out.println("移除语文后："+map);

        /*boolean containsKey(Object Key)*/
        boolean ck = map.containsKey("数学");
        System.out.println("是否包含数学这个key:"+ck);
        /*boolean containsValue(Object value)*/
        boolean cv = map.containsValue(99);
        System.out.println("是否包含99这个value值:"+cv);


        map.clear();
        System.out.println(map);



    }
}
