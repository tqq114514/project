package file36;

import java.io.File;
import java.io.FileFilter;

/*列出当前目录中所有名字包含s的子项。要求：使用匿名内部类和lambda两种写法*/
public class Test06 {
    public static void main(String[] args) {
        File file = new File("./");
        if (file.isDirectory()){
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return  file.getName().contains("s");
                }
            });
            for(File file1 :files){
                System.out.println(file1.getName());
            }
        }
    }
}
