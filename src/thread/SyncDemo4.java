package thread;
/**
 * 互斥性
 * 当使用多个synchronized锁定多个代码片段,并且指定的同步监视器对象相同时,这些代码片段就是互斥的.
 * 多个线程不能同时执行这些代码片段.
 *
 *
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Foo f = new Foo();
        Thread t1 = new Thread(){
          public void run(){
              f.methodA();
          }
        };
        Thread t2 = new Thread(){
            public void run(){
                f.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}
class  Foo{
    public synchronized void methodA(){
        try {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"正在执行A方法");
            Thread.sleep(5000);
            System.out.println(thread.getName()+"A方法执行完毕！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void methodB(){
        try {
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName()+"正在执行B方法");
            Thread.sleep(5000);
            System.out.println(thread.getName()+"B方法执行完毕！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}