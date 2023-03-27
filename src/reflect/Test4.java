package reflect;

import reflect.annotations.AutoRunClass;

import java.io.File;
import java.io.FileFilter;
import java.net.URISyntaxException;

/*输出与当前类Test4在同一个包中的所有类是否被@AutoRunClass标注*/
public class Test4 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException {
        /*获取当前类的类加载路径*/
        File dir = new File(
                Test4.class.getResource(".").toURI()
        );
        String packageName =  Test3.class.getPackage().getName();
        File[] subs = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".class");
            }
        });
        for (File sub : subs){
            String fileName = sub.getName();
            String className = fileName.substring(0,fileName.lastIndexOf("."));
            Class cls = Class.forName(packageName+"."+className);
            boolean tf = cls.isAnnotationPresent(AutoRunClass.class);
           /* System.out.println(className+(tf?":被标注了":":没有被标注"));*/
            if(tf){
                System.out.println(className+":被标注了");
            }else {
                System.out.println(className+":没有被标注");
            }
        }

    }
}
