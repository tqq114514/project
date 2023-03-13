package day07;

public class PrimeNumberPractice {
    public static void main(String[] args) {
        //先找一个数判断
        /*找出2~100之间的素数，并输出*/
        for (int num=2;num<=100;num++){
            boolean flag = true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    /*不是素数*/
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.printf("%d是素数\t",num);
            }
        }


    }
}
