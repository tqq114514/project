package reflect;

import javax.swing.*;
import java.io.File;
import java.io.FileFilter;
import java.net.URISyntaxException;
/*固定思路，使用哪个类就是定位该类的字节码文件所在目录
*
* Java文件名与类名一致
* 遍历目录中所有文件就可以通过文件名得知每个类的名字
* 然后利用class加载类对象从而实例化*/

/*实例化与当前Test2在同一个包中的所有类*/
public class Test2 {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        File dir = new File(
               Test2.class.getResource(".").toURI()
        );
        String packname = Test2.class.getPackage().getName();
        System.out.println(packname);
        //通过Test2.class所在目录获取所有子项
        File[] subs = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File dir) {
                return dir.getName().endsWith(".class");
            }
        });

        for (File sub :subs){
            String filename = sub.getName();
            /*根据文件名截取出类名*/
            String classname  =  filename.substring(0,filename.indexOf("."));
            Class cls = Class.forName(packname+"."+classname);
            Object o = cls.newInstance();
            System.out.println(o);

        }

    }
}
