package day07;

import java.util.Scanner;

/*需求
输入机票原价、月份、头等舱、商务舱、经济舱的仓号
求最终的机票价格
旺季（5-10月） 头等舱 9折  商务舱 8.5折 经济舱 8折
淡季11月-来年4月 头等舱 7折 商务舱 6.5折 经济舱 6折
* */
public class CalculateAirPrice {
    public static void main(String[] args) {
        /*sanner 接受数据*/
        /*给舱位标号1，2，3*/
        /*计算是独立的逻辑，传入参数month,仓位编号1，2，3，淡旺季是独立的逻辑，有两条路，用if lese选择路径
        * 舱位根据编号是明显的switch,case结构*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        String[] cabin = new String[]{"头等舱","商务舱","经济舱"};
        System.out.println("输入你所需要的仓位(序号):");
        for(int i=0;i<cabin.length;i++){
            System.out.printf("%d.%s \t",i+1,cabin[i]);
        }
        System.out.println();
        int type = scanner.nextInt();
        double fPrice  = calFinalPrice(price,month,type);
        if(fPrice==-1){
            System.out.println("你的数据不合法");
        }else {
            System.out.printf("最终价格为：%f元",fPrice);
        }

    }
    private static double calFinalPrice(double price,int month,int type){
        double finalprice = 0.0;
        if(price<=0){
            return  -1;
        }
        if(month>12||month<1){
            return -1;
        }
        if(type>3||type<1){
            return -1;   //数据错误，提前中止程序并返回最终价格为-1
        }
                 if(month>=5 &&month<=10){
                    switch (type){
                    case 1:
                        finalprice = price*0.9;
                        break;
                    case 2:
                        finalprice = price*0.85;
                        break;
                    case 3:
                        finalprice = price*0.8;
                        break;
                    }
                 }else {
                     switch (type){
                         case 1:
                             finalprice = price*0.7;
                             break;
                         case 2:
                             finalprice = price*0.65;
                             break;
                         case 3:
                             finalprice = price*0.6;
                             break;
                     }
                }

        return finalprice;
    }
}
