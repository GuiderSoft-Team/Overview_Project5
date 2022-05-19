package day055.shopping;

public class DigitalProduct extends AbstractProduct{
    private byte[] content;

    public DigitalProduct(String code, String name, double price) {
        super(code, name, price);
    }

    public DigitalProduct() {
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public double checkOut() {
        return getPrice();
    }
}
