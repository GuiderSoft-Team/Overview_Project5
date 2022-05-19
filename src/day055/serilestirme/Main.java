package day055.serilestirme;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Personel p1=new Personel("0001","Hasan","Şaş",7000);
        String fileName="files/personel.dat";
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(p1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
