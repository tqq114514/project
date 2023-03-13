package string;
/*给定字符串，替换字符串*/
public class ReplaceAllDemo {
    public static void main(String[] args) {
        /*屏蔽不文明用语*/
        String line = "122322攻击12ctm4234sb";
        line = line.replaceAll("([攻击]+|[a-z]{1,3})","*");
        System.out.println(line);

    }
}
