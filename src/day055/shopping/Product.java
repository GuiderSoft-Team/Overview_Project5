package day055.shopping;

public class Product extends AbstractProduct implements ICard,IList,Comparable<Product>{
    private static final int MAX_NAME_LENGTH=100;
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

    @Override
    public void display() {
        String name=getName().length()>MAX_NAME_LENGTH?
                getName().substring(0,MAX_NAME_LENGTH-3)+"...":getName();
        System.out.println(name);
        System.out.println("-".repeat(getName().length()*2));
        System.out.println("Code   : "+getCode());
        System.out.println("Price  : "+getPrice());
        System.out.println("Weight : "+getWeight());
        System.out.println();
    }

    @Override
    public void list() {
        System.out.println(getCode()+"\t"+getName()+"\t"+getPrice()+"\t"+getWeight());
    }

    @Override
    public String toString() {
        return String.format("[%s\t%s\t%.2f\t%.2f]",
                getCode(),getName(),getPrice(),getWeight());
    }

    @Override
    public int compareTo(Product o) {
        return getCode().compareTo(o.getCode());
    }
}
