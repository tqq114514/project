package string;
/*char charAt(int index);
返回当前字符串指定位置（index）上的字符---根据位置找字符
* */
public class CharAtDemo {
    public static void main(String[] args) {
        String str = "think in Java";
        char returnChar = str.charAt(6);
        System.out.println(returnChar);
        /*字符串下标越界*/
        /*char c = str.charAt(20);
        System.out.println(c);*/
        /*应用：随机生成下标，从而获取随机验证码*/

    }
}
