package file;

import java.io.File;
import java.io.FileFilter;

/*文件过滤器lambda*/
public class ListFilesDemo3 {
    public static void main(String[] args) {
        File dir = new File("./");
        if (dir.isDirectory()){
            File[] files = dir.listFiles( file -> file.getName().endsWith(".txt") ); //找出所有后缀为txt的文件
            for (File f :files){
                System.out.println(f.getName());
            }
        }
    }
}
