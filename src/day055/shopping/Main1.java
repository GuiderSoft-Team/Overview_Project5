package day055.shopping;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] sayilar={4,1,7,19,3,5};
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        Product[] products={
                new Product("0001","Kitap",4.5,1.0),
                new Product("0003","Defter",1.7,1.0),
                new Product("0002","Kalem",0.5,1.0)
        };

        System.out.println(Arrays.toString(products));
        Arrays.sort(products);
        System.out.println(Arrays.toString(products));

        char[] chars={'B','F','A','K'};
        System.out.println(Arrays.toString(chars));
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

    }
}
