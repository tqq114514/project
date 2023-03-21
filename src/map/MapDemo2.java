package map;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*map的遍历
* */
public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("语文",100);
        map.put("数学",99);
        map.put("英语",150);
        map.put("物理",36);
        map.put("化学",87);
        System.out.println(map);
        /*遍历所有的key*/
        /*set<Key> keySet(),set是不可重复集合*/
        /*将当前Map中所有的key以一个Set集合的形式返回，遍历这个集合就相当于遍历了所有的key*/
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            System.out.println("key:"+key);
        }
        System.out.println();
        /*Map.Entry他的每一个实例用于表示Map中的一组键值对
        * Entry有两个常用方法：
        * getKey(),getValue()分别哟关于表示获取其表示的键值中的key和value*/
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet){
             String key = entry.getKey();
             Integer value = entry.getValue();
            System.out.println(key+":"+value);
        }
        System.out.println();
        /*单独去取每一个value值
        * Collect<V> values()*/
        Collection<Integer> values = map.values();
        for (Integer value : values){
            System.out.println("value:"+value);
        }

        System.out.println();

        /*Jdk8以后集合和Map提供了一种全新的遍历方式：
        * 该方法是foreach()
        * 集合中，foreach方法会将集合中的每个元素拿到并调用Consumer的accept方法陆续传入
        * Consumer:消费者*/
        /*  keySet.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        keySet.forEach(s-> System.out.println(s));
        System.out.println();
        /*在lambda表达式中，如果参数与调用方法时传入的参数一致，可以简写为方法引用
        * e->对象.方法（e）
        * 可以写成 对象::方法*/
        keySet.forEach(System.out::println);
        System.out.println();

        /*map也提供了方法引用*/
        /*map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+":"+integer);
            }
        });*/
        map.forEach((s,integer)-> System.out.println(s+":"+integer));



    }
}
