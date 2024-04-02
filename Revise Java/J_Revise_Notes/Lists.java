// Implementing the ArrayList and the Vectors 
import java.util.*;

class Lists{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // Using the Lists syntax and method for array and vectors 
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello World ");
        list.add(1, "Sian");
         for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
     }
    //  It is very important to note that lists take only referenced data types use wrapper classes
    //  Implementing the Vectors 
    Vector<Integer> vec = new Vector<Integer>();
    // Using Dynamic Arrays 
    // Inputting a Vector using the Loops 
    for(int i =0;i<8;i++){
        System.out.println("Enter the value of the element "+(i+1));
        // Directly taking input without creating a dump variable
        vec.addElement(sc.nextInt());
    }
    //  Printing the Entered Vector Quantity Using the Loops 
    for(int i=0;i<vec.size();i++){
        System.out.println(vec.elementAt(i));
    }
    }
}