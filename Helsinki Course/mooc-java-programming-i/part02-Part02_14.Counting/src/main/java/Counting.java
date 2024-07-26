
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usecase of limited iterations using for-loop
        int num;
        num=Integer.valueOf(scanner.nextLine());
        for(int i=0;i<=num;i++){
            System.out.println(i);
        }
    }
}
