package stringtrainning;
/*静态方法，将其他数据类型转换为String类型*/
public class ValueOf {
    public static void main(String[] args) {
        //将int型变量a转换为String类型并赋值
        int age = 12;
        String str = String.valueOf(age);
        System.out.println(str);
        //将double型变量b转换为String类型并赋值
        double price = 12.22;
        String str1 = String.valueOf(price);
        System.out.println(str1);

/*        String str2  = age+"";
        System.out.println(str2);*/
        //由于需要在类中频繁创建String对象，效率低，不使用，用StringBuilder类

    }
}
