package file;

import ooday04.Fish;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2 {
    public static void main(String[] args) {
        File dir = new File("./");
        if(dir.isDirectory()){
            FileFilter filter = new FileFilter() {
                @Override
                public boolean accept(File file) {
                    String name = file.getName();
                    return name.endsWith(".txt");
                }
            };
            File[] subs = dir.listFiles(filter);
            for (File file:subs){
                System.out.println(file.getName());
            }
        }


    }
}
