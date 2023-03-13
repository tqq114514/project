package day05;

public class MultiTablePractice {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){  //控制每一行
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
