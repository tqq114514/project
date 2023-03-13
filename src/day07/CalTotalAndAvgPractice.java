package day07;

import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;

/*六个评委给选手打分，要求分数范围在0~100之间的整数
选手得分：去掉最高分，去掉最低分，计算其他四个成绩的平均分
 */
/*1.录入分数方法
2、计算总分，需要去掉最高分和最低分，求解最高分以及最低分
3、调用录入分数方法，取出数组长度;调用总分数组，获取总分
* */
public class CalTotalAndAvgPractice {
    public static void main(String[] args) {
        double[] score = addscores();
        double sum = scoreSum(score);
        System.out.println("总分为"+sum);
        double avg = scoreAvg(score,sum);
        System.out.println("平均分为"+avg);
    }
    public static double[] addscores(){
        double[] scores = new double[6];
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<scores.length;i++){
            System.out.printf("第%d个评委的打分为:",i+1);
            scores[i] = scanner.nextInt();
        }
        return scores;
    }
    public static double scoreSum(double[] score){
        double sum = 0.0;
        double max = score[0];
        double min = score[0];
        for(int i = 0;i<score.length;i++){
            if(score[i]>max){
                max = score[i];
            }
            if(score[i]<min){
                min = score[i];
            }
            sum += score[i];
        }
        return sum-min-max;
    }
    public static double scoreAvg(double[] score ,double scoreSum){
        double avg = 0.0;
        avg = scoreSum/(score.length-2);
        return avg;

    }
}
