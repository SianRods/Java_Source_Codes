import java.util.*;

public class CollectObjects {
    public static void main(String args[]){
        Vegies v1 = new Vegies("Carrot", 1.46);
        Vegies v2 = new Vegies("Potato", 3.98);
        Vegies v3 = new Vegies("Brocolli", 8.45);

        ArrayList<Vegies> list = new ArrayList<>();
        // Created an ArrayLlist Containing all the Vegies Objects 
        list.add(v1);
        list.add(v2);
        list.add(v3);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    
}

class Vegies{
    private String name;
    private double price;

  public   Vegies(String initialName, double priceOfVeg){
        this.name=initialName;
        this.price=priceOfVeg;
    }

    public String name(){
        return name;
    }

    // In order to Print Something on Outputting only the object name we must use the toString Method;

    public String toString(){
        return "Name of the vegies is "+name+"And has the price of"+price;
    }

}