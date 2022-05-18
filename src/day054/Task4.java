package day054;

/**
 * Task4 ve Task 5
 */
public class Task4 {
    public static void main(String[] args) {
        drawLine(5,'*');
        drawLine(3);
        drawLine(20,'x');
        drawLine(30);
        drawLine(30,'-');
    }

    public static void drawLine(int quantity, char symbol){
        //System.out.println((""+symbol).repeat(quantity));
        for (int i = 0; i < quantity; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public static void drawLine(int quantity){
        drawLine(quantity,'-');
    }
}
