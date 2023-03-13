package file36;

import java.io.File;

public class Test06lambda {
    public static void main(String[] args) {
        File file = new File("./");
        File[] files = file.listFiles(f-> f.getName().contains("s"));
        for(File file1 :files){
            System.out.println(file1.getName());
        }
    }
}
