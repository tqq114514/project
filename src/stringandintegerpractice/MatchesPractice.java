package stringandintegerpractice;
/*matches使用给定的正则表达式验证当前字符串是否符合要求，返回值为Boolean*/
public class MatchesPractice {
    public static void main(String[] args) {
        /* [a-zA-Z0-9_]{1,20}@[a-z0-9_]{2,10}(\\.[a-z]{2,}){1,2}*/
        String email = "tongqq1157595131@gmail.com.cn";
        boolean flag = email.matches("[a-zA-Z0-9_]{1,40}@[a-z0-9_]{2,10}(\\.[a-z]{2,}){1,2}");
        if(flag){
            System.out.println("邮箱格式正确");
        }else {
            System.out.println("邮箱格式错误");
        }


    }
}
