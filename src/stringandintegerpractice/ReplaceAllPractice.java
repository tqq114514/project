package stringandintegerpractice;
/*replaceAll用于字符串替换敏感内容*/
public class ReplaceAllPractice {
    public static void main(String[] args) {
        String str = "abc123def456ghi78";
        str = str.replaceAll("[0-9]+","*"); //替换掉数字
        System.out.println(str);
    }
}
