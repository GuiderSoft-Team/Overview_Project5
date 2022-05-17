package day053;

public class Task2 {
    public static void main(String[] args) {
        //Task 2
        int x=5,y=7;
        System.out.println(String.format("x = %d\ty=%d",x,y));

        int tmp=x;
        x=y;
        y=tmp;

        System.out.println(String.format("x = %d\ty=%d",x,y));


    }
}
