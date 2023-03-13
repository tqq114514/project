package day03;

public class IfDemo {
    public static void main(String[] args) {
        //1、简单的if结构
       /*if(boolean){
       * 语句块，基于条件执行
       * }
       * */
        double price= 700.0; //消费金额，用浮点型
        if(price>=500){
            price *= 0.8;
        }
        System.out.println("打折后的价格为:"+price);

        //判断成绩是否合法，只有一个选项，合法则执行，不合法就不执行
        int score = 115;
        if(score>=0 && score<=100){
            System.out.println("成绩合法,你的"+"成绩为"+score);
        }
        System.out.println("程序继续执行");

    }
}
