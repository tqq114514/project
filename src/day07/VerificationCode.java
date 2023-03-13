package day07;

import java.util.Random;

/*
* 生成？位验证码（大写字母、小写字母、数字）
* */
public class VerificationCode {
    public static void main(String[] args) {
         String code = generateVeriCode(6);
        System.out.println("验证码："+ code);
    }
    public static String generateVeriCode(int len){
        String code = "";
        char[] charString ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
                ,'p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I',
        'J','K','L','M','N','O','P','Q','R','S','T','0','1','2','3','4','5','6','7','8','9'};
        Random random = new Random();
        for (int i=1;i<=len;i++){   //len次
            /*int index = (int) (Math.random()*charString.length); */  //随机下标，写62个范围是0~61
            int index = random.nextInt(charString.length);
            code += charString[index];  //获取随机字符拼接的code中
        }
        return code;
    }
}
