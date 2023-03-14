package thread;
/*线程的优先级
线程有十个优先级，使用整数1-10表示
其中1表示最小优先级，10为最高优先级，5为默认值
* */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread("1"){
            public void run(){
                for (int i = 0;i<1000;i++){
                    System.out.println("333");
                }
            }
        };
        Thread thread2 = new Thread("2"){
            public void run(){
                for (int i = 0;i<1000;i++){
                    System.out.println("111");
                }
            }
        };
        Thread thread3 = new Thread("3"){
            public void run(){
                for (int i = 0;i<1000;i++){
                    System.out.println("222");
                }
            }
        };
        thread1.setPriority(Thread.MIN_PRIORITY);  //3
        thread2.setPriority(Thread.MAX_PRIORITY);  //1
        thread3.setPriority(Thread.NORM_PRIORITY);  //2
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
