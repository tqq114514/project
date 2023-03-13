package ooday05;

public class EnumDemo {
    public static void main(String[] args) {
        /*Season s  =  Season.SPRING;
        String ss = s.toString();
        System.out.println(s);
        System.out.println(s.getSeasonName());
        System.out.println(s.getSeasonDesc());*/

        /*枚举的应用，获取所有对象*/
        Season[] seasons = Season.values();
        for (int i = 0 ;i<seasons.length;i++){
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getSeasonName());
            System.out.println(seasons[i].getSeasonDesc());
        }


        /*switch case案例*/
        Season season  = Season.SUMMER;
        switch (season){
            case SPRING:
                System.out.println("天气"+season.getSeasonDesc()+"去玩啦");
                break;
            case SUMMER:
                System.out.println("天气"+season.getSeasonDesc()+"去吃冰棍了");
                break;
            case AUTUMN:
                System.out.println("天气"+season.getSeasonDesc()+"去放风筝了");
                break;
            case WINTER:
                System.out.println("天气"+season.getSeasonDesc()+"去睡觉了");
                break;
        }
    }
}