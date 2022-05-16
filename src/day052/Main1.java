package day052;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main1 {
    private String name;
    public static void main(String[] args) {
        char[] isim={'A','H','M','E','T'};
        String adSoyad=new String(isim);
        if (adSoyad.equalsIgnoreCase("AHMeT")){
            System.out.println("Aynısıdır.");
        }
        isim[0]='B';

        adSoyad=adSoyad.toLowerCase();

        byte[] data = adSoyad.getBytes(StandardCharsets.UTF_8);


        System.out.println(adSoyad);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(isim));
    }
}
