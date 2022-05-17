package day053;

public class Task9 {
    public static void main(String[] args) {
        for (int i = 500; i <=1000 ; i++) {
            if(i%7==0&&i%11==0){
                System.out.print(i+"\t");
            }
        }

        System.out.println();
        for (int i = 500; i <=1000 ; i++) {
            if (i%(77)==0) System.out.print(i+"\t");
        }
    }
}
