package shopping;

public class Apple extends ProductsFather{
    protected String sweetness;

    public Apple(){

    }

    public Apple(String sweetness) {
        this.sweetness = sweetness;
    }

    public Apple(double price, String name, int sum, String sweetness) {
        super(name, price, sum);
        this.sweetness =sweetness;
    }
}
