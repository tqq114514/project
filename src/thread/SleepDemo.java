package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SleepDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("程序开始了");
        /*程序启动后在控制台输入一个数字，从该数字每秒递减，到0时输出”时间到“，然后程序结束*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //System.in 为低级流
        String line = br.readLine();
        int num = Integer.parseInt(line);
        for(;num>0;num--){
            System.out.println(num);
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
        System.out.println("时间到");
    }
}
