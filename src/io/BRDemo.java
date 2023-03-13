package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./pw2.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);
        String line;
        /*readLine(),*/
        while ((line = br.readLine())!= null){
            System.out.println(line);   //想换行要println,读不到空串
        }
        br.close();


    }
}
