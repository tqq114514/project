package day07;

import java.util.Scanner;

/*需求
输入机票原价、月份、头等舱、商务舱、经济舱的仓号
求最终的机票价格
旺季（5-10月） 头等舱 9折  商务舱 8.5折 经济舱 8折
淡季11月-来年4月 头等舱 7折 商务舱 6.5折 经济舱 6折
* */
public class CalculateAirPricePractice {
    public static void main(String[] args) {
        /*通过Scanner获取机票原价、月份、舱位等数据*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double originalPrice = scanner.nextDouble();
        System.out.println("请输入月份：");
        int month = scanner.nextInt();
        String[] cabin = new String[]{"头等舱","商务舱","经济舱"};
        System.out.println("请选择机舱号:");
        for(int i=1;i<=cabin.length;i++){
            System.out.printf("%d.%s",i,cabin[i-1]);
        }
        System.out.println();
        int type = scanner.nextInt();
        double fPrice = finalPrice(originalPrice,month,type);
        System.out.printf("最终价格为%f",fPrice);
    }
    public static double finalPrice(double price,int month,int cabin){
        double fPrice=0.0;
        /*先判断给定的数据是否合法*/
        if(price<=0){
            return -1;
        }
        if(month>12 || month<1){
            return -1;
        }
        if(cabin<1 || cabin>3){
            return -1;
        }
        /*旺季（5-10月） 头等舱 9折  商务舱 8.5折 经济舱 8折
        淡季11月-来年4月 头等舱 7折 商务舱 6.5折 经济舱 6折*/

        if(month>=5 && month<=10){
            switch (cabin){
                case 1:
                    fPrice = price * 0.9;
                    break;
                case 2:
                    fPrice = price *0.85;
                    break;
                case 3:
                    fPrice = price *0.8;
                    break;
            }
        }else {
            switch (cabin){
                case 1:
                    fPrice = price * 0.7;
                    break;
                case 2:
                    fPrice = price *0.65;
                    break;
                case 3:
                    fPrice = price *0.6;
                    break;
            }
        }
        return fPrice;
    }
}
