package day07;

public class VerificationCodePrice2 {
    public static void main(String[] args) {
        String s = vCode(4);
        System.out.println("验证码为："+s);

    }
    public static String vCode(int length){
        String s ="";
        char[] charString ={
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'
                ,'p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I',
                'J','K','L','M','N','O','P','Q','R','S','T','0','1','2','3','4','5','6','7','8','9'
        };
        for(int i=1;i<=length;i++){
            int index = (int) (Math.random()*charString.length);
            s += charString[index];
        }
        return s;
    }
}
