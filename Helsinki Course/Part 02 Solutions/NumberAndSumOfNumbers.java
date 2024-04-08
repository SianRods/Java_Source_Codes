
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Zero is to be excluded from the number count 
        int sum =0;
        int num;
        int i=-1;
        do{
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
            sum +=num;
            i++;
        } while(num!=0);
        System.out.println("Number of numbers: "+i);
        System.out.println("Sum of the numbers: "+sum);
    }
}
