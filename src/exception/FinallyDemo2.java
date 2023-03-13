package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo2 {
    public static void main(String[] args)  {
        System.out.println("程序开始了");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./a/b/fos.dat");
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出现io错误并解决");
        }finally {
            try {
                fos.close();
            } catch (Exception e) {
                System.out.println("关闭流时出现异常并解决");
            }
        }
        System.out.println("程序结束了");
        /*ctrl、Alt、t */
    }
}
