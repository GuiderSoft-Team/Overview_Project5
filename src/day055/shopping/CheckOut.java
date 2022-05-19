package day055.shopping;

import java.util.ArrayList;

public class CheckOut {
    private ArrayList<AbstractProduct> products;

    public CheckOut() {
        products=new ArrayList();
    }

    public void addProduct(AbstractProduct product){
        if (product!=null) {
            products.add(product);
        }
    }

    public void removeProduct(AbstractProduct product){
        products.remove(product);
    }

    public double calculate(){
        double total=0.0;
        for(AbstractProduct product:products){
            total+= product.checkOut();
        }
        return total;
    }

}
