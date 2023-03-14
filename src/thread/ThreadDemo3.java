package thread;

/*使用匿名内部类完成两种方式线程的创建*/
public class ThreadDemo3 {
    public static void main(String[] args) {


        /*继承Thread重写run方法*/
        Thread t1 = new Thread1(){
            public void run(){
                for (int i =0 ;i<500;i++){
                    System.out.println("fbi");
                }
            }
        };
        /*
        * */
         Runnable r2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("我是查水表的");
                }
            }
        };
        Thread t2 = new Thread(r2);


        /*单独定义线程任务,并使用lambda表达式创建*/
        /*Runnable r2 = () -> {
                for (int i =0 ;i<500;i++){
                    System.out.println("open door");
                }
        };
        Thread t2 = new Thread(r2);*/

        /*简写模式*/
        /*Thread t2 = new Thread(() -> {
            for (int i =0 ;i<500;i++){
                System.out.println("open door");
            }
        });*/

        t1.start();
        t2.start();
    }
}


