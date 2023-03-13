package ooday04;

import java.util.Timer;
import java.util.TimerTask;

public class Timer2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int interval = 1000;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("该写代码了。。。。");
            }
        }, 1000, 1000);
    }
}