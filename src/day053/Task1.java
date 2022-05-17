package day053;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Task 1
        Scanner input=new Scanner(System.in);
        System.out.println("Karşılaştırmak için iki sayı giriniz:");
        System.out.print("Sayı 1 : ");
        int sayi1 = input.nextInt();
        System.out.print("Sayı 2 : ");
        int sayi2 = input.nextInt();
        if (sayi1>sayi2){
            System.out.println("Birinci sayı daha büyüktür.");
        }else if (sayi2>sayi1){
            System.out.println("İkinci sayı daha büyüktür.");
        }else {
            System.out.println("Her iki sayı da birbirine eşittir.");
        }
    }
}
