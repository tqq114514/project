package reflect;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

/*调用与当前类Test3所在同一包中那些类中名字含有s的无参方法*/
public class Test3 {
    public static void main(String[] args) throws Exception {
        /*获取当前类所在路径*/
        File dir =new File(
                Test3.class.getResource(".").toURI()
        );
        /*Test3.class.getPackage()*/ //获取该类‘package’对象,然后通过调用getName()方法获取对应的包名
        String packageName =  Test3.class.getPackage().getName();
        /*获取dir目录中所有子项*/
        File[] subs = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File dir) {
                return dir.getName().endsWith(".class");
            }
        });
        /*遍历目录，获取所有子项*/
        for(File sub :subs){
            String fileName = sub.getName();
            String className = fileName.substring(0,fileName.lastIndexOf("."));
           /* System.out.println(className);*/
            Class cls = Class.forName(packageName+"."+className);
            Object obj = cls.newInstance();
            Method[] methods = cls.getDeclaredMethods();
            for(Method method : methods){
                if(method.getName().contains("s")
                && method.getParameterCount()==0){
                    method.invoke(obj);
                }
            }

        }
    }
}
