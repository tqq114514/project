package stringtrainning;
/*判断当前字符串是否是以给定的定符串开始/结束的*/
public class StartWithEndWith {
    public static void main(String[] args) {
        String str = "Thinking in Java";
        boolean flag = str.startsWith("Think");
        System.out.println(flag);
        boolean flag1 = str.startsWith("ink",2);
        System.out.println(flag);
        boolean flag3 = str.endsWith("java");
        System.out.println(flag3);
    }

}

