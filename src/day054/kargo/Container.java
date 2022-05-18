package day054.kargo;

import java.util.ArrayList;

public final class Container extends Box{
    private ArrayList<Box> boxes;
    public Container(double width, double height, double depth) {
        super(width, height, depth);
        boxes=new ArrayList<>();
    }

    public Container() {
        this(250,300,1360);
    }

    public void load(Box box){
        if (box!=null&&remainingVolume()>= box.getVolume()){
            boxes.add(box);
        }
    }

    public void unload(Box box){
        boxes.remove(box);
    }

    public double remainingVolume(){
        return getVolume()-loadVolume();
    }

    public double loadVolume(){
        double volume=0.0;
        for(Box bx:boxes){
            volume+=bx.getVolume();
        }
        return volume;
    }

    @Override
    public String toString() {
        return String.format("Container [%.2f x %.2f x %.2f]",getWidth(),getHeight(),getDepth());
    }


}
