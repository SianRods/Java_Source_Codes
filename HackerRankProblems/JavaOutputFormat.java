// Output Format Specifier 
import java.util.*;
public class JavaOutputFormat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Creating Arraylist to store Strings 
        ArrayList<String> list = new ArrayList<>(3);
        // Creating Arrays to Store Integer Vlaues
        int  nums[] = new int[3];
        // Taking Inputs for 3 Strings and 3 intgers Values Using Loops 
        for(int i=0;i<3;i++){
            // Adding the String to array list 
            list.add(i,sc.next());
            // Adding Numbers to the array 
            nums[i]=sc.nextInt();
        }

        for(int j=0;j<3;j++){
            System.out.print(list.get(j));
            // Formatting of 15 Character for justification
            for(int k=0;k<15;k++){
                System.out.print(" ");
            }
            for(int l=0;l<3;l++){
                nums[l]= 000+nums[l];
            }

            // Printing the Integer Digits 
            System.out.println(nums[j]);
            // Adding a NewLine Character 
            System.out.print("\n");
        }
    }
    
}