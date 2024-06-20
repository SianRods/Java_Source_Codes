
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        System.out.print("Give a number: ");
        num=Integer.valueOf(scanner.nextLine());
        int result=1;
        for(int i=num;i>=1;i--){
            result *= i;
        }
        System.out.println("Factorial: "+result);

    }
}
