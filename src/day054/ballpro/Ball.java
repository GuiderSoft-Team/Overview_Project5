package day054.ballpro;

public class Ball {
    private double radius;
    private String color;
    private boolean pattern;

    public Ball(double radius,String color, boolean pattern){
        setRadius(radius);
        setColor(color);
        this.pattern=pattern;
    }

    public Ball(){
        this(1.0,"black",false);
    }

    public void setRadius(double radius){
        if (radius<1.0){
            radius=1.0;
        }
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null||color.isEmpty()||color.isBlank()){
            color="black";
        }
        this.color = color.trim();
    }

    public boolean hasPattern() {
        return pattern;
    }

    public void setPattern(boolean pattern) {
        this.pattern = pattern;
    }

    public double getVolume(){
        return 4.0/3.0*Math.PI*Math.pow(radius,3);
    }


    @Override
    public String toString() {
        return String.format("Ball (r: %.1f - v: %.4f)",radius,getVolume());
    }
}
