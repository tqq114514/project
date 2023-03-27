package reflect;

/*反射机制实例化Person
* */

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        /*获取对应的类对象
         * 通过类对象的newInstance()方法实例化*/
        /*java.util.ArrayList
        * java.util.HashMap
        * java.util.Date
        * reflect.Person*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个类的完全限定名:");
        String className = scanner.nextLine();
        Class<?> cls = Class.forName(className);
        /*newInstance()方法会调用类的无参构造器*/
        Object object = cls.newInstance();
        System.out.println(object);
    }
}
