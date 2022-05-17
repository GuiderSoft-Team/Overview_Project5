package day053;

public class Main {
    public static void main(String[] args) {
        //length(), charAt(index)
        //          012345
        String str="Deneme";

        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }

        //replace
        //str = str.replace("e", "a");

        System.out.println();
        System.out.println(str);

        //substring
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,3));
        System.out.println(str.substring(2,6));
        System.out.println(str.substring(2,str.length()));


        //indexof
        System.out.println(str.indexOf('e'));
        for (int i = 0; i < str.length(); i++) {
            str.indexOf(str.charAt(i));
        }

        System.out.println(str.lastIndexOf('e'));
        System.out.println();
        int ndx=-1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='e') {
                ndx=str.indexOf('e',ndx+1);
                System.out.println(ndx);


            }
        }


        //concat
        System.out.println(str.concat(" 1 2 3").concat(" 4 5 6"));
        System.out.println(str);

        //contains
        if (str.contains("mee")) System.out.println("Var");
        else System.out.println("Yok");
    }
}
