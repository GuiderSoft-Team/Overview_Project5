package day052;

public class Main {

    public static void main(String[] args) {
        //Task 1
        int ogrenciYasi=24;//statement

        //Task 2
        double koliAgirlik=4.5;

        //Task 3
        boolean isEmpty=false;

        //Task 4
        float birimFiyat=21.50F;

        //Task 5
        char medeniHal='E';

        //Task 6
        long evreninYasi=14_000_000_000L;

        //Task 7
        byte maxValue=Byte.MAX_VALUE;
        byte minValue=Byte.MIN_VALUE;
        System.out.println("Byte Maximum Value = "+maxValue);
        System.out.println("Byte Minimum Value = "+minValue);

        //Task 8
        short s1=1600;
        byte b1=120;
        short s2=(short) (s1+b1);

        //Task 9
        String isim="Mehmet";
        System.out.printf("Benim adım %s.",isim);
        System.out.println();

        //Task 10
        int yil=1970;
        int ay=12;
        int gun=23;
        //String dogumTarihi=""+yil+"-"+ay+"-"+gun;
        String dogumTarihi=String.format("%d-%d-%d",yil,ay,gun);
        System.out.println(dogumTarihi);

        //Task 11
        int x=5;
        x++;
        ++x;
        x=x+1;
        x+=1;
        System.out.println("X'in değeri= "+x);

        //Task 12
        int y=6;
        y--;
        --y;
        y=y-1;
        y-=1;
        System.out.println("Y'nin değeri = "+y);

        //Task 13
        int z=7;
        z=z+4;
        z+=4;
        System.out.println("Z'nin değeri = "+z);

        //Task 14
        int bolum=17/3;
        int kalan=17%3;
        int toplam=bolum*3+kalan;
        System.out.println("Tam Bölme işlemi = "+bolum);
        System.out.println("Kalan = "+kalan);
        System.out.println("Toplam = "+toplam);

        //Task 15
        boolean res=10>=3;
        System.out.println("Result = "+res);

        //Task 16
        char sonuc=15>18?'K':'B';
        System.out.println(sonuc);

        //Task 17
        //& op
        // false&false:false
        // false&true: false
        // true&false: false
        // true&true:  true
        //    76543210
        //11: 00001011 (1x2^3+0x2^2+1x2^1+1x2^0=8+0+2+1=11)
        // 7: 00000111 (1x2^2+1x2^1+1x2^0=4+2+1=7)
        //&-->00000011 (1x2^1+1x2^0=2+1=3)
        //|-->00001111 (1x2^3+1x2^2+1x2^1+1x2^0=8+4+2+1=15)
        int result1=11&7;
        int result2=11|7;
        System.out.println("Result = "+result1);
        System.out.println("Result = "+result2);
        //RSA algoritması
        //MD5 algoritması
        //SHA algoritması
        //Sitmetrik ve asimetrik şifreleme algoritmaları



        //Task 18
        //Karşılaştırma Operatörleri: <,>,<=,>=, ==, !=
        boolean result=11!=10;
        System.out.println(result);

        //Task 19
        boolean comp=(5<2) && (7>=3);
        System.out.println(comp);

        //Task 20
        //   76543210
        //5: 00000101 (1x2^2+0x2^1+1x2^0=4+1=5)
        //shf00000010  (1x2^1+0x2^0=2)  çöp 1
        int sayi=5>>1;
        System.out.println("Sayı : "+sayi);

    }
}
