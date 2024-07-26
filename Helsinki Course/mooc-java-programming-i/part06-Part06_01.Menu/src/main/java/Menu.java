
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

// list 'Menu' is created everytime an object if formed 
    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!(this.meals.contains(meal))){
            this.meals.add(meal);
        }

    }

    public void printMeals(){
        for(int i=0;i<meals.size();i++){
            System.out.println(meals.get(i));
        }
    }

    // clearing all the ojects on the list --> Delete
    // Using the inbuilt Clear Method for the ArrayList

    public void clearMenu(){
       meals.clear();
    }

   
}
