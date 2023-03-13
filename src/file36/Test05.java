package file36;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*程序启动后，要求用户输入一个文件名，如果文件存在则提示并要求用户更换，直到该文件还不存在为止，然后将这个文件在当前目录中创建出来。*/
public class Test05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要创建的文件名");
        while (true){
            String s = scanner.next();
            File file = new File("./"+s);
            if (file.exists()){
                System.out.println("文件已存在，请重新输入");
            }else {
                file.createNewFile();
                System.out.println("文件创建成功！");
                break;
            }
        }
    }
}
