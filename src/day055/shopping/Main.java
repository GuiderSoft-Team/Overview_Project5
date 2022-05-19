package day055.shopping;

/**
 * Task 0, 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
 *      22, 23, 24, 25, 26,
 */
public class Main {
    public static void main(String[] args) {

        CheckOut checkOut=new CheckOut();
        checkOut.addProduct(new Product("0001","Java Kitabı",45.0,-1));
        checkOut.addProduct(new Product("0002","C# Kitabı",35.0,-1));
        checkOut.addProduct(new DigitalProduct("D0001","Python Kitabı (pdf)",7.0));
        checkOut.addProduct(new DigitalProduct("D0002","Javascript Kitabı (pdf)",9.0));
        checkOut.addProduct(new DigitalProduct("D0003","Çocuk Gelişimi (pdf)",17.0));
        checkOut.addProduct(new Product("0007","Sehpa",40.0,5));

        //Tüm Liste
        for(AbstractProduct p:checkOut.getProducts()){
            ((IList)p).list();
        }
        System.out.println("-".repeat(50));
        //Ürün Kartları
        for(AbstractProduct p:checkOut.getProducts()){
            ((ICard)p).display();
        }


    }
}
