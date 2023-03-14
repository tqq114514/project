package thread;
/*Thread 线程的演示
*
* */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread = new Thread1();
        Thread thread1 = new Thread2();
        thread.start();   //调用线程的start()方法启动线程，调用后run方法很快被执行
        thread1.start();
    }
}
/*线程与干的事是耦合（绑定了）的，Thread1只能输出400次开门
* java单继承导致继承了Thread就无法再继承其他类，实现方法复用*/
class Thread1 extends  Thread{
    public void run(){    //线程中需要执行的代码
        for(int i = 0; i<400;i++){
            System.out.println("开门！");
        }
    }
}
class Thread2 extends  Thread{
    public void run(){
        for (int i =0;i<400;i++){
            System.out.println("查水表！");
        }
    }
}