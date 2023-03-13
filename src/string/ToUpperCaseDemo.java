package string;

/*String toUpperCase(),将字符中的所有英文部分转换为全大写*/


public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String s = "我爱 Super。";
        s = s.toUpperCase();  //toUpperCase,大写
        System.out.println(s);
        s = s.toLowerCase();  //toLowerCase,小写
        System.out.println(s);

    }
    /*验证码：不区分大小写*/
}
