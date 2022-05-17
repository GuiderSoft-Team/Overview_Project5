package day053;

public class Task7 {
    public static void main(String[] args) {
        boolean flag=true;
        int sayac=0;
        while (true){
            sayac++;
            System.out.println("Sonsuz döngüye girildi.");

            if (sayac<5) continue;
            if (flag){
                System.out.println("Flag true");
                break;
            }

        }
    }
}
