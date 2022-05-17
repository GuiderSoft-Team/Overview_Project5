package day053;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 10 adet sayı giriniz.");
        int[] sayilar=new int[10];
        for (int i = 0; i < sayilar.length; i++) {
            System.out.print((i+1)+". sayı : ");
            sayilar[i]= input.nextInt();
        }

//        int[] sayilar={2,4,7,1,10,9,7};

        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
/*        int sayi=sayilar[0];
        for (int i = 1; i < sayilar.length ; i++) {
            if(sayi>sayilar[i]){
                sayilar[i-1]=sayilar[i];
                sayilar[i]=sayi;
            }
        }*/




    }
}
