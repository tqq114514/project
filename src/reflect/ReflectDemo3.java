package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*使用指定的构造器实例化对象*/
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /*获取类对象*/
        Class<?> cls = Class.forName("reflect.Person");

        Constructor<?> c = cls.getConstructor(String.class,int.class);
        Object obj = c.newInstance("张三",52);
        System.out.println(obj);


    }
}
