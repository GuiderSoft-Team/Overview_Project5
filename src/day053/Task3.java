package day053;

public class Task3 {
    public static void main(String[] args) {
        int a=17,b=110;
        if (a>b){
            System.out.println(1);
        }else if(b>a){
            System.out.println(-1);
        }else {
            System.out.println(0);
        }

        //ternary
        int result=a>b?1:b>a?-1:0;
        System.out.println(result);
    }
}
