package thread;
/*同步块，尽可能缩小同步的范围，适用于需要多个线程同步执行的代码段
* 保证安全的前提下尽可能提高并发效率*/
public class SyncDemo2 {
    public static void main(String[] args) {
        shop shop = new shop();
        /*shop shop1 = new shop();
        shop shop2 = new shop(); */   //两个人进不同店，也排起了队伍，明显不合理
        Thread wkj = new Thread("王克晶"){
            public void run(){
                shop.buy();
            }
        };
        Thread fcq = new Thread("范传奇"){
            public void run(){
                shop.buy();
            }
        };
        wkj.start();
        fcq.start();
    }
}
class shop {
    /*public synchronized void buy(){*/
    /*在方法中使用synchronized*/
    public void buy(){
        try {
            Thread t1 = Thread.currentThread();  //获取运行buy方法的线程
            System.out.println(t1.getName()+":正在挑衣服");
            Thread.sleep(3000);
            /*
                synchronized不是公平锁,当一个线程进入后,如果后续有5个线程陆续执行到这里开始排队时
                当进入的线程出了同步块后,并不是后五个中先排队的线程先进入,而是后五个线程谁先拿到时间片
                谁先进入执行.
                如果想实现公平锁,可以使用JUC(java.util.concurrent包),java并发包
                这个包中包含了很多和并发相关的API.
                java.util.concurrent.locks.ReentrantLock 可重入锁可以实现公平锁机制
             */

            /*必须被调用识别为同一对象，这里指代main方法中的shop对象
            * new Object() 形式主义，执行时会自动new新的对象，直接可以进入执行
            *字面量对象“hello”也可以，String是不变对象，可能会导致不需要排队的场景也进行了排队，不合适*/
            synchronized (this){  //同步块，同步监视器，只能说引用数据类型
                System.out.println(t1.getName()+":正在试衣服");
                Thread.sleep(5000);
            }
            System.out.println(t1.getName()+":结账走人");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
