package shopping;


public class ProductsFather {
    protected String name;   //商品的名字
    protected double price;  //商品的价格
    protected int sum;   //商品的数量
    public ProductsFather() {
    }
    public ProductsFather(String name,double price,int sum){
        this.price= price;
        this.name = name;
        this.sum = sum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
