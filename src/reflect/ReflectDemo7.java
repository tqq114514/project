package reflect;

import reflect.annotations.AutoRunClass;
/**
 * 反射机制中访问注解
 */
public class ReflectDemo7  {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
            查看Person类是否有被注解@AutoRunClass标注?

            反射对象:
            Class           类对象:它的每一个实例用于表示一个类
            Method          方法对象:它的每一个实例用于表示一个方法
            Constructor     构造器对象
            Field           属性对象
            Annotation      注解对象
            所有反射对象都支持一个方法:
            boolean isAnnotationPresent(Class cls)
            该方法用于判断当前反射对象表示的内容是否被参数类对象表示的注解标注了，若被标注则返回true
         */
        //1加载类对象
        Class<?> cls = Class.forName("reflect.Person");
        //2判断当前类对象cls表示的类Person是否被指定的注解@AutoRunClass标注了
        boolean tf = cls.isAnnotationPresent(AutoRunClass.class);
        System.out.println("是否被标注了:"+tf);
    }
}
