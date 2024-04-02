// Creating array of different objects 
import java.util.*;
// Note that in order to print an attribute of an object we have to use the objectname+
//  the method or the attribute we want to print 
class ObjectsArray{
    public static void main (String args[]){
        Student s1 =new Student("Sian","2432");
        Student s2 =new Student("Sahil","2423");
        Student s3 =new Student("Vdant","2324");
        // Student arr[]= new Student[3]; -->. Initialising using the new keyword 
        Student arr[] ={s1,s2,s3};
        for(int i=0;i<3;i++){
            System.out.println(arr[i].name);
        }
       
    }
}
// Student Class 
class Student {
    String name ;
    String id;
    // Constructor no 1 
    Student(String naam , String ide){
        name = naam;
        id =ide;
    }
}