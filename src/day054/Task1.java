package day054;

public class Task1 {
    public static void main(String[] args) {
        //Metodun çağrılması

        int kare = getKare(7);
        System.out.println(kare);
        System.out.println(getKare(5));
    }

    /**
     * Verilen bir tamsayının karesini döndürür.
     * @param deger
     * @return
     */
    public static int getKare(int deger){
        return (int) Math.pow(deger,2);
    }
}
