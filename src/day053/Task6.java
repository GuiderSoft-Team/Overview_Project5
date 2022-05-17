package day053;

public class Task6 {
    public static void main(String[] args) {
        char[] chars={'F','A','R'};
        int toplam=0;
        for (int i = 0; i < chars.length; i++) {
            toplam+=chars[i];
        }
        int ort=toplam/ chars.length;
        System.out.println("Ortalama = "+(char)ort);
    }
}
