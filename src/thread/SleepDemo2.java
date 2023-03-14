package thread;

/**
 * sleep方法要求必须处理中断异常InterruptedException
 * 当一个线程调用sleep方法处于睡眠阻塞的过程中若该线程的interrupt方法被调用,那么此时会立即中断该线程的
 * 睡眠阻塞,此时sleep方法会通过抛出异常告知这一现象.
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread zhang  = new Thread("张三"){
          public void run(){
              System.out.println("刚下班睡一觉吧。。。");
              try {
                  Thread.sleep(600000000);
              } catch (InterruptedException e) {
                  System.out.println("干嘛呢，打扰我睡大觉");
              }
              System.out.println("张三被吵醒了。");
          }
        };
        Thread li  = new Thread("李四"){
            public void run(){
                System.out.println(getName()+"正在想歪主意吵醒张三");
                for (int i=0;i<5;i++){
                    System.out.println(getName()+"准备喊人！5,4,3,2,1");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("时间结束，准备干活。");
                zhang.interrupt();
            }
        };
        zhang.start();
        li.start();
    }
}
