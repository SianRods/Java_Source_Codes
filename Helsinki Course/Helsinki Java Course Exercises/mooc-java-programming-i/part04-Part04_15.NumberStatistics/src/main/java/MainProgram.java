
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
    
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!

        Scanner sc = new Scanner(System.in);
        Statistics s1 = new Statistics();
        Statistics s2 = new Statistics();
        Statistics s3 = new Statistics();
        int num;

        // s1 Calculating the Sum
        while(true){
            System.out.println("Enter numbers:");
            num=Integer.valueOf(sc.nextLine());
            if( num!=-1){
                s1.addNumber(num);
                if(num%2==0 ){
                    s2.addNumber(num);
                }
                if(num%2!=0){
                    s3.addNumber(num);
                }
            }else{
                break;
            }
        }

        System.out.println("Sum: "+s1.sum());
        System.out.println("Sum of even numbers: "+s2.sum());
        System.out.println("Sum of odd numbers: "+s3.sum());
        // s2 Calculating the Sum of Even Numbers;

    }
}


// The Program is objectnotaccesible error