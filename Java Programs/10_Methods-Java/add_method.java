import java.util.*;
// We can directly access the method of a class within the class without creating any instance variable 
public class add_method {
    public static void main(String ards[]){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        x=sc.nextInt();
        System.out.println("Enter the second number :");
        y=sc.nextInt();

        System.out.println(add(x,y));
    }
// Here the use of static KEYWORD is very Important 
// Here as we are delcaring the method 'add' with the class add_method there is no need 
//  to create a separate object and then call the method 
    static int add (int a , int b){
        int z = a+b;
        return z;
    }
}
