package string;
/*
 boolean  startswith(String s);
 boolean  endswith(String s);
 以。。。开头，以。。。结尾，做代码格式验证
* */
public class StartWithDemo {
    public static void main(String[] args) {
        String str = "Java is bestest";
        boolean status = str.startsWith("Jav");
        System.out.println(status);
        boolean  status1 = str.endsWith("est");
        System.out.println(status1);
    }
}
