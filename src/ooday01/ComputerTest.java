package ooday01;

public class ComputerTest {
    public static void main(String[] args) {
         Computer computer = new Computer();
         computer.size = "16寸";
         computer.brand = "戴尔";
         computer.price = 6000.00;
         computer.type();
        System.out.println();
        computer.playGames();
        System.out.println();
        computer.seeMovies();
        System.out.println();
        Computer computer1 = new Computer("联想",9500.912,"17寸");
        computer1.type();
        System.out.println();
        computer1.seeMovies();
        System.out.println();
        computer1.playGames();
    }
}
