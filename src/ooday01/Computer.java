package ooday01;

public class Computer {
     String brand;
     double price;
     String size;
     Computer(String brand,double price,String size){
         this.brand = brand;
         this.price = price;
         this.size = size;
     }
     Computer(){
     }
     void type(){
         System.out.printf("%s品牌的电脑价值%.2f,尺寸%s,被用来打字。",this.brand,this.price,this.size);
     }
     void playGames(){
         System.out.printf("%s品牌的电脑价值%.2f,尺寸%s,被用来玩游戏。",this.brand,this.price,this.size);
     }
     void seeMovies(){
         System.out.printf("%s品牌的电脑价值%.2f,尺寸%s,被用来看电影。",this.brand,this.price,this.size);
     }
}
