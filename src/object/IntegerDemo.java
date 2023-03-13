package object;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(200);
        Integer i2 = new Integer(200);
        System.out.println(i1==i2);  //false
        System.out.println(i1.equals(i2));  //true,包装类中重写了equals

        //valueof()方法会复用1个字符（-128到127）范围内的数据，建议使用valueof()
        Integer i3  = Integer.valueOf(55);
        Integer i4 = Integer.valueOf(55);
        System.out.println(i3 == i4);   //true

        Integer i5  = Integer.valueOf(128);
        Integer i6  = Integer.valueOf(128);
        System.out.println(i5 == i6);  //false 超范围了

        Integer i7 = Integer.valueOf("1212",10);
        System.out.println(i7);

        int a = i1.intValue();
        System.out.println(a);

        Integer i = 5;   //Interger i = new Interger(5); 会被编译器编译为目标语句 自动装箱
        //由基本类型到包装类

        int j =i;      //int j = i.intValue();   会被编译器编译为目标语句 自动拆箱
        //由包装类到基本类型

        /*通过包装类来获取基本类型的取值范围*/
        int  max = Integer.MAX_VALUE;
        int  min = Integer.MIN_VALUE;
        long max1 = Long.MAX_VALUE;
        long max2 = Long.MIN_VALUE;
        System.out.printf("%d,%d,%d,%d",max,min,max1,max2);

        /*包装类可以将字符串转换为相应的基本类型*/
        System.out.println();
        String s21 = "23";
        int age = Integer.parseInt(s21);
        System.out.println(age);

        String s22 = "123.456";
        double price = Double.parseDouble(s22);
        System.out.println(price);


    }

}
