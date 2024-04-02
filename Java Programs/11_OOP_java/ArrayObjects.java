import java.util.*;
//  This Code is Not Complete 
public class ArrayObjects {
    public static void main(String[] args) {
        Subjects s1 = new Subjects("Maths 1","First");
        Subjects s2 = new Subjects("Physics","Fourth");
        Subjects s3 = new Subjects("Chemistry","First");
        // Use the same syntax we used for initialising arrays of primitive data types 
        // Method 1
        // Subjects list[] = new Subjects[3];
        // Method 2 Direct intialization 
        Subjects list[]={s1,s2,s3};
        // System.out.println(list); --> Error Print using the for Loop 
    }
}

class Subjects{
    String name;
    String semester;
    String marks;
    Subjects(String name , String semester ){
        this.name = name ;
        this.semester=semester;
    }
}