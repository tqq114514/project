package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/*流自动关闭特性,java1.7之后
放在try的小括号中，最终会被编译器修改为finally中调用close()关闭的操作,参照FinallyDemo2
用于IO流操作快速关闭
必须实现AutoCloseable接口，字节流和字符流都实现了该接口
* */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try (FileOutputStream fos = new FileOutputStream("./a/b/c/a.txt")){
            fos.write(1);
        }catch (IOException e){
            System.out.println("异常捕获并处理完毕！");
        }

        System.out.println("程序结束了");
    }
}
