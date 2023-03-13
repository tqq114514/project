package day07;

public class PrimeNumberPractice2 {
    public static void main(String[] args) {
        for(int num=2;num<=100;num++) {
            boolean flag = true;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.printf("%d是素数\t",num);
            }
        }
    }
}
