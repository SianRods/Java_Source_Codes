
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int limit;
        System.out.print("Last number?");
        limit=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=limit;i++){
            sum +=i;
        }
        // Printing the value of the Sum
        System.out.println("The sum is "+sum);
    }
}
