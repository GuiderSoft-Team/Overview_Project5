package day053;

public class Main2 {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer();
        StringBuilder sb=new StringBuilder();

        sbf.append("Merhaba");


        sb.append(sbf);
        sbf.append(5);
        sb.append(" arkadaşlar.");

        System.out.println(sb);
        System.out.println(sbf);
    }
}
