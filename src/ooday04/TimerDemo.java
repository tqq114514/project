package ooday04;

import java.util.Timer;
import java.util.TimerTask;

//匿名内部类---定时器
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int interval = 1000;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("该学习了。。。。");
            }
        }, 4000, 1000);













        /*Timer timer = new Timer();  //定时器对象
        int interval = 1000;   //定时间隔（ms为单位）
        *//**//*
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("该学习了！");
            }
        }, interval,interval); //第一次需要5000ms，以后间隔1000ms重新显示*/
    }
}