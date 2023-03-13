package exception2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*io输出，不使用autoCloseable*/
public class TryCatchFinally2 {
    public static void main(String[] args)  {
        System.out.println("程序开始");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("./a/c/fos.dat");
            fos.write(2);
        } catch (IOException e) {
            System.out.println("处理字节流异常完成");
        } finally {
            try {
                fos.close();
            } catch (Exception e) {
                System.out.println("处理关闭流时的异常");
            }
        }
        System.out.println("程序结束");
    }
    /*ctrl、Alt、t */
}
