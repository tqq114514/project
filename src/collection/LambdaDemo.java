package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*使用更简洁的代码实现匿名内部类
不是所有匿名内部类都可以转换为Lambda表达式
Lambda表达式对接口的要求：只能是函数式接口
Lambda要求匿名内部类实现的接口必须重写的方法只有一个
* */
public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        /*匿名内部类写法*/
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        /*Lambda表达式写法*/
        Collections.sort(list,(String o1, String o2) -> {
            return o1.length() - o2.length();
        });

        /*参数类型可以不写*/
        Collections.sort(list,( o1, o2) -> o1.length() - o2.length());

        /*如果方法参数只有一个，小括号都可以不要*/


    }
}
