package file36;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*要求用户在控制台输入一个目录名，然后将这个目录创建在当前项目目录下*/
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要创建的目录名:");
        String s = scanner.next();
        File file = new File("./"+s);
        if (!file.exists()) {
            boolean flag = file.mkdirs();
            if (flag) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        }else {
            System.out.println("目录已存在");
        }

    }
}
