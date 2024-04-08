
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // After this, the program prints the total
        //  number of inputted values that are negative.
        // In order to satisfy this condition we need to use a if condition for specific 
        // incrementation
        // Also the zero should not be included 
        int num ;
        int i =0;
        do{
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
            if(num<0){
                i++;
            }

        }while(num!=0);
        System.out.println("Number of negative numbers: "+i);
    }
}
