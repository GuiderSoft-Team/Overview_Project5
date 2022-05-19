package day055.shopping;

public class Product extends AbstractProduct{
    private double weight;

    public Product(String code, String name, double price, double weight) {
        super(code, name, price);
        setWeight(weight);
    }

    public Product() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<1.0){
            weight=1.0;
        }
        this.weight = weight;
    }

    @Override
    public double checkOut() {
        double shipping=weight<5?8.75:12.0;
        return getPrice()+shipping;
    }
}
