package day07;
/*
需求：----常见面试题
找到2~100之间的素数(质数)
质数：除了1和它本身之外，不能被其他任何自然数整除
* */
public class PrimeNumber {
    public static void main(String[] args) {
        for (int num = 2;num<=100;num++){
            /*循环里面去判断 比如要判断45是不是质数，则2~44都需要去判读*/
            //如果能被num/2的数整除，则其不是素数，标志位置为false,num/2肯定不足1，则一定有余数
            boolean flag = true;
            for (int i=2;i<=num/2;i++){
                if(num%i == 0){  //能被2~num/2的数整除，不是素数
                    flag = false;  //需要判断完多个数，则可以使用标志位，一旦循环到能被整除的数，就置标志位为false
                    break;
                }                     //那他一定不是素数，只有所有走完都不进入循环，是满足素数条件的
            }
            if(flag){
                System.out.printf("%d是素数\t",num);
            }/*else {
                System.out.printf("%d不是素数\t",num);
            }*/
        }
    }
}
