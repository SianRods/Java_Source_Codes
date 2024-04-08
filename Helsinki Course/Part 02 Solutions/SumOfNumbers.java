
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int num;
        do{
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
            sum +=num;
        } while(num!=0);
        System.out.println("Sum of the numbers: "+sum);
    }
}
