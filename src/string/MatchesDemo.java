package string;
/*验证匹配
* boolean matches(String regex)
* 使用给定正则表达式（regex）验证当前串是否符合要求*/
public class MatchesDemo {
    public static void main(String[] args) {
        /*
        * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
        * java中必须对正则表达式中的\再次进行转义，则要写成\\.
        * 检查输入的邮箱格式是否正确
        * */
        String email = "tongqq1157595131@outlook.com";
        boolean regex =  email.matches("[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+");
        if (regex){
            System.out.println("邮箱格式正确");
        }else {
            System.out.println("邮箱格式错误，请核对");
        }
    }
}
