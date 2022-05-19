package day055.serilestirme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main1 {
    public static void main(String[] args) {
        String fileName="files/personel.dat";
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileName))){
            Personel p =(Personel) ois.readObject();
            System.out.println(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
