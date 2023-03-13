package day03;

public class IfElseDemo {
    public static void main(String[] args) {
        /*if(boolean){
        语句块1
        }else{
        语句块2
        }
        语句块1，2必走其中一块，且不可能同时执行，适用于二选一
        * */
        //满500打八折，不满500只打九折，只有两个结果打九折或者是八折
        double price = 400.0;
        if(price>=500){
            price *=0.8;
        }else {
            price *=0.9;
        }
        System.out.println("打折后的价格为:"+price);
        //判断成绩是否合法，只有两个结果，成绩非法与合法
        int score=90;
        if(score>= 0 && score<= 100){
            System.out.println("成绩"+ score +"合法");
        }else {
            System.out.println("成绩"+ score +"不合法");
        }
    }
}
