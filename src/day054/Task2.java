package day054;

public class Task2 {
    public static void main(String[] args) {
        int sum = sum(5, 7);
        System.out.println("Toplam = "+sum);
        System.out.println(sum(10,20));
    }

    /**
     * İki sayının toplamını yapar.
     * @param a
     * @param b
     * @return
     */
    public static int sum(int a,int b){
        return a+b;
    }
}
