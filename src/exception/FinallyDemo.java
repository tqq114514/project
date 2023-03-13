package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            String line = null;
            String line1 = "";
            System.out.println(line1.length());
            /*缺省return;若try中没有异常，则程序会先finally再return
            * 不写finally，则System.out.println("finally中的代码被执行了");
            * 不执行
            * finally通常用来释放资源*/
            return;
        }catch (Exception exception){
            System.out.println("出错并解决");
        }/*finally {
            System.out.println("finally中的代码被执行了");
        }*/
        System.out.println("finally中的代码被执行了");
        System.out.println("程序结束了。。。。。");

    }
}
