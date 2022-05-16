package day052;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        //String metotları
        String java="Java";
        System.out.println(java);
        //length
        int length=java.length();
        System.out.println("Uzunluk = "+length);

        //toUpperCase
        String ucJava = java.toUpperCase();
        System.out.println(ucJava);


        //toLowerCase
        String lcJava=java.toLowerCase();
        System.out.println(lcJava);


        //replace
        String replace = java.replace('a', 'e');
        System.out.println(replace);

        //split
        String message="Bu-bir-deneme-mesajıdır";

        //trim
        message=message.trim();
        String[] kelimeler = message.split("-");

        //System.out.println(Arrays.toString(kelimeler));
        for(String kelime:kelimeler){
            //isEmpty
            if (!kelime.isEmpty()) {
                System.out.print(kelime);
                System.out.print("\t\t");
                System.out.print(kelime.length());
                System.out.println();
            }
        }
    }
}
