package day054.kargo;

//Task 16, 17, 18, 19, 20, 21, 22, 23, 24, 26, 27, 28, 29,
public class Task16 {
    public static void main(String[] args) {
        Container c1=new Container();

        for (int i = 0; i < 510; i++) {
            c1.load(new Box());
        }

        System.out.printf("Kapasite    : %.4f\n",c1.getVolume());
        System.out.printf("Yük miktarı : %.4f\n",c1.loadVolume());
        System.out.printf("Kalan hacim : %.4f\n",c1.remainingVolume());

    }
}
