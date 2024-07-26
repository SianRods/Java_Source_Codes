
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Using the Concept of Infinite Loop 
        int num;
        while(true){
            System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());

            if(num<0){
                System.out.println("Unsuitable number");
                continue;
                // Loop Continues
            } else if (num==0){
                break;
            } else if (num>0){
                // Number to the power of two
                System.out.println(num*num);
            }
        }

    }
}
