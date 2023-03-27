package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/*使用反射机制调用方法*/
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        p.sayHello();

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入类名：");
        String className = scanner.nextLine();
        System.out.println("请输入方法名：");
        String methodName = scanner.nextLine();
        /*实例化哪个类，调用哪个方法由我们决定*/
        /*Class cls = Class.forName("reflect.Person");*/
        Class cls = Class.forName(className);
        Object obj = cls.newInstance(); //Object object = new Person(); 多态
        /*调用方法*/
        //1获取待调用方法的方法对象
        Method method = cls.getMethod(methodName);
        //2通过方法对象来调用此方法
        method.invoke(obj);  //obj.sayHello()
    }
}
