package thread;

/*Java中所有代码都是线程运行的
main方法也不例外，当JVM启动后会自动创建一条线程，并取名为”main“,然后这条线程的run方法执行后会开始调用
我们写的main方法
由此运行main方法的线程被我们称主线程
* */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        doSome();
    }
    public static void doSome(){
        /*ThreadLocal类,作用:在一个线程的执行流程中可以跨方法共享数据.
            此时内部就使用了currentThread方法.*/
        Thread thread1 = Thread.currentThread();
        System.out.println(thread1);

    }
}