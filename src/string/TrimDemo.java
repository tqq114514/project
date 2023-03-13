package string;
/*去除字符串两边的空白字符
* 由于String是不变对象，使用trim(),需要存储新的对象
* 只能去除两边的*/
public class TrimDemo {
    public static void main(String[] args) {
        String s = "          qwq qaq       ";
        s =s.trim();     //s发生了改变，重新进行了接收，是新的对象
        System.out.println(s);
        /*trim，避免在用户名前后加入空格而用户不知道的情况*/

    }
}
