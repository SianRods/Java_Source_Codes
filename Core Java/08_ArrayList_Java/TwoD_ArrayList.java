import java.util.ArrayList;

public class TwoD_ArrayList {
    // In 2D Array List we store mutiple array list into an A single Array List 
    //  ArrayList of 'Arraylists'
    public static void main (String args[]){
        ArrayList<String> breads = new ArrayList<String>();
        breads.add("Garlic Bread");
        breads.add("Wheat Bread");
        breads.add("White Bread");

        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("Skittles");
        snacks.add("Nutella");
        snacks.add("Chips");

        ArrayList<String> sauce = new ArrayList<String>();
        sauce.add("Tomato");
        sauce.add("Noodle Sauce");
        sauce.add("Italian Sauce");
        // Accessing each element of the ArrayList 
        for(int i=0;i<sauce.size();i++){
            System.out.println(sauce.get(i));
        }

        //  Now we will make a new ArrayList of the data type --> ArrayList<String> 
        // Which can store all the Above list into a single Array list 

        ArrayList<ArrayList<String>> grocerylist =new ArrayList<ArrayList<String>>();
        grocerylist.add(sauce);
        grocerylist.add(snacks);
        grocerylist.add(breads);
        System.out.println(grocerylist);


    }
}
