package thread;
/*静态方法锁
在一个静态变量上使用synchronized,同样的锁对象不可选，但不是this，是类对象
* */
public class SyncDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(Boo::doSome);
        Thread t2 = new Thread(Boo::doSome);
        t1.start();
        t2.start();
    }
}
class  Boo{/*有同步，有先后顺序执行*/
    public  static void doSome(){   //获取类对象  Boo.class   类名.class
        /*同步块*/
        synchronized (Boo.class){
            try {
                Thread currentThread = Thread.currentThread();
                System.out.println(currentThread.getName()+"正在执行do something方法...");
                Thread.sleep(5000);
                System.out.println(currentThread.getName()+"执行do something方法完毕");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
