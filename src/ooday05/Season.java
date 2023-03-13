package ooday05;

public enum Season {
    /*SPRING,SUMMER,AUTUMN,WINTER;*/  //四个常量就相当于四个对象
    /*枚举的方法是私有的，无法被使用*/


    SPRING("春天","暖和"),
    SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),
    WINTER("冬天","寒冷");

    private String seasonName;
    private String seasonDesc;

    Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }


}
