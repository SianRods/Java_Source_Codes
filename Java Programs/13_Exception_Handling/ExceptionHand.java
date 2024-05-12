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
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception has Occured Try Again !!");
        }
        catch(Exception e){
            System.out.println(e);
            // Printing e will print the inbuilt message for that exception
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

//  Types of Exception (Compile Time ) there are Checked and Unchecked(Runtime Exceptions) Exceptions
//  1. Checked Excpetions Must be Compulsorily Handled in Java or the code Does not Compile 
//  2. Unchecked Exceptions may or may not be handled the java will through an Exception Error and the flow of the
//  Code will be interupted if the Exception is not handled 