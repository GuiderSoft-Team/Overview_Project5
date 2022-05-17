package day053.serilestirme;

import java.io.Serializable;

public class Nokta implements Serializable {
    private int x,y;

    public Nokta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Nokta() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Nokta{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
