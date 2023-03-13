package file;

import java.io.File;

/*访问一个目录中的子项*/
public class ListFilesDemo {
    public static void main(String[] args) {
        File dir = new File("./");
        if(dir.isDirectory()){
            /*System.out.println("是个目录并且已存在");*/
            File[] subs = dir.listFiles();
            /*for (File sub :subs){
                System.out.println(sub.getName());
            }*/
            for (int i = 0 ;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }else {
            System.out.println("不存在或者不是个目录");
        }
        /*File file = new File("./114514.txt");
        if(file.isFile()){
            System.out.println("是个目录并且已存在");
        }else {
            System.out.println("不存在或者不是个文件");
        }*/

    }
}
