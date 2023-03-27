package reflect;


import java.lang.reflect.Method;

/*JAVA反射机制*/
/**/
public class ReflectDemo1 {
    public static void main(String[] args) {
        /*获取String的类对象*/
        Class cls = String.class;
        String name = cls.getName();  //获取当前类对象所表示的类的完全限定名
        System.out.println(name);
        name = cls.getSimpleName(); //仅获取类名
        System.out.println(name);
        System.out.println();

        /*java.lang.reflect.Method
        * Method的每一个实例用于表示一个方法*/
        Method[] methods = cls.getMethods();
        /*获取当前类对象所表示的类的所有公开方法*/
        for (Method method:methods){
            String methodName = method.getName();
            System.out.println(methodName);
        }
        System.out.println();

        /*package每一个实例表示一个包*/
        Package pack = cls.getPackage();
        String s  = pack.getName();
        System.out.println(s);
    }
}
