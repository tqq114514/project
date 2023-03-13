package stringandintegerpractice;

public class IntegerPractice {
    public static void main(String[] args) {
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println(i1 == i2);  //false
        System.out.println(i1.equals(i2));  //true, 包装类中重写了equals方法

        /*使用valueof方法赋值，但只能是一个字节范围内的数据-128到127*/
        Integer i3 = Integer.valueOf(5);
        Integer i4 = Integer.valueOf(5);
        System.out.println(i3 == i4);   //true
        System.out.println(i3.equals(i4));  //true

        /*由包装类转为基本数据类型*/
        int i = i3.intValue();
        System.out.println(i);

        /*利用包装类获取基本数据类型取值范围*/
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.printf("max=%d,min=%d",max,min);
        System.out.println();
        long max1 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;
        System.out.printf("max=%d,min=%d",max1,min2);
        System.out.println();
        //包装类可以将字符串转换为对应的基本类型
        String str = "50";
        int age = Integer.parseInt(str);
        System.out.println(age);

        String dou = "123.12";
        double price = Double.parseDouble(dou);
        System.out.println(price);

        /*自动装箱*/
        Integer ii = 523;   //Integer ii = Integer.valueOf(523);
        /*自动拆箱*/
        int j = ii;         //int j = ii.intValue();
        System.out.println(j);




    }
}
