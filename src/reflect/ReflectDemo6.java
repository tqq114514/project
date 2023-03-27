package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*强行调用私有方法*/
public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();
        Method method = cls.getDeclaredMethod("haha");
        method.setAccessible(true);
        method.invoke(obj);
        method.setAccessible(false);
    }
}
