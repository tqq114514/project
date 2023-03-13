package day04;

public class whileCircleDemo {
    public static void main(String[] args) {
        //while判断执行多次
        /*while (boolean){   //判断多次
            语句块        //执行多次
        }*/
        //循环解决反复多次执行相同或相似的代码
        //while \do while\ for
        //如重复输出一句话，输出9*9乘法表
        int count =0;  //循环变量的初始化，循环的条件，循环变量的改变
        while (count<=4){   //输出五次书籍是人类进步的阶梯
            System.out.println("书籍是人类进步的阶梯");
            count++;
        }
        System.out.println("继续执行2");
        int front=1,next=9;   //输出1~9单列乘法表
        while(front<=9){
            System.out.println(front+"*"+next+"="+front*next);
            front++;
        }
        System.out.println("继续执行3");
        int front2=-1,next2=9;  //输出1，3，5，开头的单列乘法表
        while(front2<9){
            front2+=2;
            System.out.println(front2+"*"+next2+"="+front2*next2);
        }
        System.out.println("继续执行4");

    }
}
