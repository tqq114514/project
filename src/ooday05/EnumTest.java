package ooday05;

public class EnumTest {
    public static void main(String[] args) {
        /*获取所有枚举的对象并输出*/
        PracticeSeason[] seasons = PracticeSeason.values();
        for(int i = 0;i< seasons.length ;i++){
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getSeasonName());
            System.out.println(seasons[i].getSeasonFeature());
        }
        PracticeSeason season = PracticeSeason.valueOf("SPRING");
        switch (season){
            case SPRING:
                System.out.println("天气"+season.getSeasonFeature());
                break;
            case SUMMER:
                System.out.println("天气"+season.getSeasonFeature());
                break;
            case AUTUMN:
                System.out.println("天气"+season.getSeasonFeature());
                break;
            case WINTER:
                System.out.println("天气"+season.getSeasonFeature());
                break;
        }
    }
}
