package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*调有参方法*/
public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method method = cls.getMethod("say", String.class);  //Person.say(String info){}
        method.invoke(obj,"嘿嘿"); //obj.say("嘿嘿");


        Method method1 = cls.getMethod("say", String.class, int.class);
        method1.invoke(obj,"哈哈",5);

    }
}
