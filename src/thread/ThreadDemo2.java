package thread;
/*使用Runnable接口单独定义线程任务*/
public class ThreadDemo2 {
    public static void main(String[] args) {
      /*单独实例化任务*/
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();

       /*创建线程并指派任务*/
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);
        thread1.start();
        thread2.start();
    }
}
class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<1000;i++){
            System.out.println("fbi");
        }
    }
}
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<1000;i++){
            System.out.println("open door");
        }
    }
}
