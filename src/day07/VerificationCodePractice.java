package day07;

import java.util.Random;

/*
 * 生成？位验证码（大写字母、小写字母、数字）
 * */
public class VerificationCodePractice {
    public static void main(String[] args) {
        String vcode = verfiCode(4);
        System.out.println("验证码:"+vcode);

    }
    public static String verfiCode(int length){
        String string = "";
        char[] charString ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
                ,'p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I',
                'J','K','L','M','N','O','P','Q','R','S','T','0','1','2','3','4','5','6','7','8','9'};
        Random random = new Random();
        for(int i=1;i<=length;i++){
            int index = random.nextInt(charString.length);
            string += charString[index];
        }
        return string;
    }
}
