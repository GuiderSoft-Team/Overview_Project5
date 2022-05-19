package day055.shopping;

public abstract class AbstractProduct {
    private String code;
    private String name;
    private double price;

    public AbstractProduct(String code, String name, double price) {
        this.code = code;
        this.name = name;
        setPrice(price);
    }

    public AbstractProduct() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            price=0;
        }
        this.price = price;
    }

    public abstract double checkOut();
}
