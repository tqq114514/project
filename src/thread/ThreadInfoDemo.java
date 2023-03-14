package thread;

/*线程相关信息的demo*/

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread thread = new Thread("thread_best"){
            public void run(){
                /*String getName
                * 获取线程的名字
                * 我们定义的线程如果没有指定名字，系统分配一个名字叫Thread-X
                * X是一个数字*/
                String name = this.getName();
                System.out.println(name);
                /*id不需要自己指定
                * 1、非空
                * 2、唯一*/
                long id = this.getId();
                System.out.println(id);
                boolean isInterrupted = this.interrupted();
                boolean isDaemon = this.isDaemon();
                boolean isAlive = this.isAlive();
                System.out.println("线程是否被中断？"+isInterrupted);
                System.out.println("线程是否为守护线程？"+isDaemon);
                System.out.println("线程是否还存活？"+isAlive);

            }
        };
        thread.start();
    }
}
