package file36;

import java.io.File;
import java.util.Scanner;

/*要求用在控制台输入一个目录名，然后将当前项目目录下的这个目录删除。（只要求删除Test03创建的空目录）*/
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要删除的目录名:");
        String s = scanner.next();
        File file = new File("./"+s);
        if (file.exists()) {
            boolean flag = file.delete();
            if (flag) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("没有该目录名");
        }
    }
}
