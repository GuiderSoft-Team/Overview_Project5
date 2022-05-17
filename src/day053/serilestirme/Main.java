package day053.serilestirme;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Nokta n1=new Nokta(7,5);
        System.out.println(n1);
        try {
            FileOutputStream fos = new FileOutputStream("files/noktalar.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(n1);
            oos.close();
            fos.close();
        }
        catch (Exception ex){

        }
    }
}
