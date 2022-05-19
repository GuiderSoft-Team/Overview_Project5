package day055.shopping;

public class DigitalProduct extends AbstractProduct implements ICard,IList{
    private static final int MAX_NAME_LENGTH=100;
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

    @Override
    public void display() {
        String name=getName().length()>MAX_NAME_LENGTH?
                getName().substring(0,MAX_NAME_LENGTH-3)+"...":getName();
        System.out.println(name);
        System.out.println("-".repeat(getName().length()*2));
        System.out.println("Code  : "+getCode());
        System.out.println("Price : "+getPrice());
        System.out.println("Link  : http://download/"+getCode());
        System.out.println();
    }

    @Override
    public void list() {
        System.out.println(getCode()+"\t"+getName()+"\t"+getPrice());
    }
}
