package day053;

import java.util.Arrays;
import java.util.Collections;

public class Task11 {
    public static void main(String[] args) {
        int[] sayilar={1,5,250,75,302,100,2,6,124,99,100,212,6,100,7};
        int[] durum=new int[3];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]==100){
                durum[0]++;
            }else if(sayilar[i]>100){
                durum[1]++;
            }else {
                durum[2]++;
            }
        }

        //Task 12
        System.out.println(Arrays.toString(durum));
        for (int i = 0; i < durum.length; i++) {
            System.out.print((i==0?"E":i==1?"B":"K")+"\t");
            System.out.println("*".repeat(durum[i]));
        }

        //Task 13
        //Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        //Task 14
        int[] tersSirali=new int[sayilar.length];
        for (int i = 0; i < tersSirali.length; i++) {
            tersSirali[i]=sayilar[tersSirali.length-i-1];
        }
        System.out.println(Arrays.toString(tersSirali));

        //Task 15
    }
}
