package thread;


public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread thread = new Thread("thread_best"){
            public void run(){
                String name = this.getName();
                System.out.println(name);

            }
        };
        thread.start();
    }
}
