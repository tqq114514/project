package exception;


/*1、异常处理过程：当发生错误，JVM new一个异常出来，要求代码必须解决
2、如果代码中没有做异常处理，则找到代码所在的方法来处理
3、代码所在的方法没有处理，则溯源到main()方法处理
4、继续找到main方法的调用者，即JVM虚拟机进行处理
5、还没有处理则直接中止程序运行并报错
* */
public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            /*代码片段*/
            /*try块中某句代码出现异常，那么try块中这句代码以下的代码都不执行*/
            /*try语句中如果不执行异常，catch块不执行*/
            String line = null;
            System.out.println(line.length());
            String line1 = "";   //上一句出现异常，try块中此句及以下代码都不会被执行
            System.out.println(line1.charAt(0));
            String line2 = "abc";
            System.out.println(Integer.parseInt(line2));
        /*}catch (NullPointerException e){  //异常类型
            *//*当try的代码片段出现xxxException时的补救措施*//*
            System.out.println("解决空指针异常");
        }catch (IndexOutOfBoundsException e){
            System.out.println("解决下标越界异常");*/
        }catch (IndexOutOfBoundsException | NullPointerException e){
            System.out.println("两个异常都解决了");
        }
        catch (Exception e ){
            System.out.println("反正出错给你解决了");
            /*但两种异常处理方式相同时，可以一起处理，但是不能用短路或，||是错误的*/
        }finally {
            System.out.println("异常肯定处理好了");
        }
        System.out.println("程序结束了");

    }
}
