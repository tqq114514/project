package file;

import java.io.File;

public class DeleteFileDirDemo {
    public static void main(String[] args) {
        File file = new File("./files.txt");
        if (file.exists()){
            file.delete();
            /*若要删除目录，则目录必须为空，才能删除，./a/b/c  表示删除a下的b下的c  ./a  a里面有目录，则不能删除*/
            System.out.println("文件已删除");
        }else {
            System.out.println("文件不存在");
        }
        File file1 = new File("./a");
        if (file1.exists()){
            file1.delete();
            /*若要删除目录，则目录必须为空，才能删除，./a/b/c  表示删除a下的b下的c  ./a  a里面有目录，则不能删除*/
            System.out.println("文件已删除");
        }else {
            System.out.println("文件不存在");
        }
        for (int i = 1;i<=10;i++){
            File file2 = new File("./files"+i+".txt");
            if (file2.exists()){
                file2.delete();
                System.out.println("已删除");
            }
        }

    }
}
