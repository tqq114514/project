package thread;

/*多线程并发安全问题
* 当多个线程并行操作同一临界资源，由于线程切换时机不成熟，导致操作临界资源发生混乱*/
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread("张三"){
            public void run(){
                while (true){  //若一个异常抛出到run方法之外,意味着这个线程也会结束
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2 = new Thread("李四"){
            public void run(){
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}
class Table{
    private int beans = 20;
    public  synchronized  int  getBeans() {  //给这个方法加锁，防止一个线程进入执行后另一个线程也进去执行，以防止数据顺序错乱
        if (beans == 0) {
            throw new RuntimeException("豆子拿完了");
        }
        /*拿到数据还没输出*/
        Thread.yield(); //运行该方法的线程主动放弃本次剩余时间片
        return beans--;
    }
}
