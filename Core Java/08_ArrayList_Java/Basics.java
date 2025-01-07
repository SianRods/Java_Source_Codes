
/*
 * ArrayList is a class in java (Referenced Data Type) which  can be used to store resizable Arrays
 * --> After the compilation phase ArrayList helps remove / add an element which can't be done  in case of Arrays 
 * --> However it is important to note that ArrayList can only store Refrenced Data Types 
 */
import java.util.ArrayList;

public class Basics {
    public static void main(String args[]) {
        // As it is a Class intialization Format will be same as other classes
        // ArrayList<Data_Type_Ref> Object_Name =new ArrayList<DataType_Ref>();
        ArrayList<String> names = new ArrayList<String>();
        // --> Alternate Method with which we can Steup an Arry List ArrayList<String>
        // names = new ArrayList();
        // Using the method 'objectname.add' We can add elements to our ArrayList
        names.add("Sian");// Now the "Sian" will be stored at 0th index of the String Names
        names.add("Smayan");
        names.add("Vedant");

        // Printing Seriallly Unlike the Arrays Where we were using the Length Function
        // for an array herewe will be using obj_NAME.size() --> size is a function of
        // class ArrayList
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
            // Here using the .get(index) --> Method we can access the Elements of the
            // String Serially
        }

        // In order to overwrite Data we can use .set(index,Data_Type) --> Method
        names.set(2, "Shilank Sir");
        // We can also directly print the ArrayList using Object Name Where Additional
        // Cuurly Brackets are also Applied
        System.out.println(names);

    }
}
/*Footnotes -->
1. ArrayList is a refernced data types which can be used to store resizable arrays 
2.Unlike in Arrays using Array List editing of the elements is much quicker using its methods 
3.Different Methods used in ArrayList -->
a. size --> objname.size();
b. adding elements to the array --> objname.add(ref_data_type);
c.For Accessing the elemets of the array use --. objname.get(index_Number);




 */