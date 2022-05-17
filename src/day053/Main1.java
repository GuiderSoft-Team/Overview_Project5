package day053;

public class Main1 {
    public static void main(String[] args) {
        //StringBuilder
        String str="";
        StringBuilder sb=new StringBuilder();
        sb.append("Merhaba,");
        sb.append("\n");
        sb.append("Bu mektup hal hatır sormak amacıyla kaleme alınmıştır.");
        StringBuilder reverse = sb.reverse();
        sb.reverse();
        sb.insert(50,"Deneme");

        sb.delete(50,56);


        System.out.println(sb);
        System.out.println(reverse);

    }
}
