import java.util.*;
// Implementing Concept of Exception Handling and using try{} cath(){} to overcome the error 
public class ExceptionHand {
    public static void main(String args[]){
        try{
        Scanner sc = new Scanner(System.in);
        int a ;
        int b;
        System.out.println("Enter the Number to be Divided :");
        a=sc.nextInt();
        System.out.println("Enter the Number to be Divided by : ");
        b=sc.nextInt();
        int z = a/b;
        System.out.println("Result"+z);
        // If the Divisor is Zerov --> Runtime Exception
        }
        catch(Exception e){
            System.out.println("Error has Occured Try Again !!");
        }
    }
}
// Exceptions --> Errors Encountered whilecode Execution Disrupting the Flow of intructions 
// to be executed --> For Example Input Type MisMatch Error , etc 
/*
 *  try{
 * 
 *          ** Block of Code where possibility of exceptions are there 
 * } 
 * catch(ExceptionName varname){
 *          *block to be executed in case of exception
 * }
 * 
 * --> We can also use try_catch for specific Exceptions Only 
 */