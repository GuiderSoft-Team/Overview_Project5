package day053.serilestirme;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("files/noktalar.bin");
            ObjectInputStream ois=new ObjectInputStream(fis);
            Nokta nokta = (Nokta) ois.readObject();
            System.out.println(nokta);
            ois.close();
            fis.close();
        }catch (Exception ex){

        }
    }
}
