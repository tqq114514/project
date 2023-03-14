package thread;
/**
 * 守护线程
 *
 * java进程中至少要有一条用户线程活着,否则进程就会结束.如果进程在结束时发现还有守护线程活着会强行杀死这些
 * 线程.
 *
 * 守护线程是通过用户线程启动前调用方法setDaemon(true)设置而来的.
 * 而用户线程就是我们默认创建的线程.
 *
 * 守护线程和用户线程是两类，某个守护线程不是只守护某一个用户线程
 *不用关心线程什么结束的线程可以设置为守护线程
 *
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread("rose") {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + " say:Let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName() + "跳海了！！！！");
            }
        };
        Thread jack = new Thread("jack") {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + " say:you jump! I jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        rose.start();
        jack.setDaemon(true);  //将jack线程设置为守护线程
        jack.start();

        /*
            如果让主线程死循环,那么rose线程结束,jack也不会被进程杀死
            因为主线程也是用户线程,只要进程中有一条用户线程活着,进程就不会结束,也就不会强行杀死守护线程
         */
        /*while (true);*/
    }
}
