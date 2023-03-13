package file;

/*1、访问其表示的文件或目录的属性信息（名字、大小、权限）
* 2、创建删除目录或文件
* 3、访问一个目录中的子项信息
* File不能访问文件数据*/
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;

public class FileDemo {
    public static void main(String[] args) {
        /*使用相对路径有利于跨平台
        常用的相对路径还有类加载文件
        * ./在Idea中表示当前类所在的项目目录*/
        File file =new File("./demo.yml");
        String s = file.getName();
        System.out.println(s);
        long l = file.length();  //文件或者目录所对应的长度（大小）
        System.out.println(l);
        boolean ifHidden = file.isHidden();
        boolean ifRead = file.canRead();
        boolean ifWrite =  file.canWrite();
        boolean ifExecute = file.canExecute();
        System.out.println(ifHidden);
        System.out.println(ifRead);
        System.out.println(ifWrite);
        System.out.println(ifExecute);




    }
}
