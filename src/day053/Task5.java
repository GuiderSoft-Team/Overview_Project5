package day053;

public class Task5 {
    public static void main(String[] args) {
        int[] values={2,4,6};
        int toplam=0;
        for (int i = 0; i < values.length; i++) {
            toplam+=values[i];
        }
        System.out.println("Toplam= "+toplam);
        System.out.println();

        int sum=0;
        for(int value:values){
            sum+=value;
        }
        System.out.println("Sum = "+sum);
    }
}
