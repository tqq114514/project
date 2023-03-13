package day07;

import java.util.Scanner;

/*六个评委给选手打分，要求分数范围在0~100之间的整数
        选手得分：去掉最高分，去掉最低分，计算其他四个成绩的平均分
        方法1：录入分数,六个评委的成绩，需要double[]
        方法2：计算总分
        方法3：计算平均分
        * */
public class CalTotalAndAvgDemo {
    public static void main(String[] args) {
        double[] scoreInput = scoreInput();  //录入成绩
        double scoreAvg = scoreAvg(scoreInput);    //计算平均分
        System.out.printf("你的平均分为:%f",scoreAvg);
    }
    public static double[] scoreInput(){       //录入分数
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[6];
        for(int i=0;i<array.length;i++){
            System.out.printf("请输入第%d个评委的打分:",i+1);
            array[i] = scanner.nextDouble();
        }
        return  array;
    }
    //计算总分,拿出最高分，拿出最低分，总分去掉最高分和最低分
    public static double scoreSum(double[] scores){
            double sum = 0.0;
            double max =scores[0];
            double min = scores[0];
            for (int i=0;i<scores.length;i++){
                if(scores[i]>max){
                    max =scores[i];
                }
                if(scores[i]<min){
                    min = scores[i];
                }
                sum += scores[i];
            }
            sum = sum-max-min;
            return sum;

    }
    //计算平均分,传入数组，由它去调用总分
    public static double scoreAvg(double[] scores){
        double sum = scoreSum(scores);
        double avg = sum/(scores.length-2);
        return avg;
    }
}
