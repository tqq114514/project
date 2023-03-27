package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*利用反射机制调用Person类中所有的无参方法*/
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("reflect.Person");
        Object obj = cls.newInstance();

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods){
            if(method.getParameterCount()==0 &&
                    method.getModifiers() == Modifier.PUBLIC){
                method.invoke(obj);
            }
        }
    }
}
