package day055.shopping;

/**
 * Task 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
 */
public class Main {
    public static void main(String[] args) {

        CheckOut checkOut=new CheckOut();
        checkOut.addProduct(new Product("0001","Java Kitabı",45.5,-1));
        checkOut.addProduct(new Product("0002","C# Kitabı",35.8,-1));
        checkOut.addProduct(new DigitalProduct("D0001","Python Kitabı (pdf)",7.45));

        System.out.println("Toplam Ücret = "+checkOut.calculate());

    }
}
