package day05;

public class MultiTable {
    public static void main(String[] args) {

        for(int num=1;num<=9;num++){  //控制一行
            for(int i =1;i<=num;i++){   //控制一列
                //5*6=30,外层一次，内层一圈，嵌套层数越少越好
                //一个break只能跳出一层循环
                System.out.print(i+"*"+num+"="+i*num+"\t");
            }
            System.out.print("\n"); //换行
        }
    }
}
