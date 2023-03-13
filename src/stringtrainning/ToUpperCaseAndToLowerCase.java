package stringtrainning;

public class ToUpperCaseAndToLowerCase {
    public static void main(String[] args) {
        //将str中的英文部分转换为全大写
        String str = "我爱Java";
        String s = str.toUpperCase();
        System.out.println(s);
        //将str中的英文部分转换为全小写
        String s1 = str.toLowerCase();
        System.out.println(s1);

    }
}
