package test;

public class test1 {
    public static void main(String[] args) {
        for(int i=9;i>0;i--){   //控制一行，则第2个元素9不变，让第一个元素走1~9的循环，第二个元素从9向下递减
            for (int j=1;j<=i;j++){   //第二个元素变为8，通过j<=i约束，使第一个元素走1~8的循环就中止
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
