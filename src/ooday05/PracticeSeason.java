package ooday05;

public enum PracticeSeason {
    //表示Season的固定四个对象，都是常量
    SPRING("春天","气候宜人"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","十分寒冷");
    private String seasonName;
    private String seasonFeature;

    private PracticeSeason(String seasonName,String seasonFeature){
        this.seasonName = seasonName;
        this.seasonFeature = seasonFeature;
    }
    public String getSeasonName(){
        return seasonName;
    }
    public void setSeasonName(String seasonName){
        this.seasonName = seasonName;
    }

    public String getSeasonFeature() {
        return seasonFeature;
    }

    public void setSeasonFeature(String seasonFeature) {
        this.seasonFeature = seasonFeature;
    }
}
