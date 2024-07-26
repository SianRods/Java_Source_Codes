
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // No such element found exception error!
        
        // Write your program here
        // Part 1
        int num ;
        System.out.print("Where to? ");
        num=Integer.valueOf(scanner.nextLine());
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }

        // Part 2
        int start;
        int end ;
        System.out.print("Where to? ");
        end=Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        start=Integer.valueOf(scanner.nextLine());
        for(int i=start;i<=end;i++){
            System.out.println(i);
        }

    }
}
