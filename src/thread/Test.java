package thread;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        /*CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();*/
        ArrayList<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(() -> {
            for(int i =1;i<=1000;i++){
                synchronized (list){  //同步监视器对象通常可以选取临界资源（多个线程抢的对象）
                    list.add(i);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i =1;i<=1000;i++){
                synchronized (list){  //Test.class也可以，但不合适
                    list.add(i);
                }
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(3000); //阻塞主线程等待上面两个线程执行完毕
        System.out.println(list.size());
    }
}
