
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int num;
        int i=-1;
        int j=0; // Used to calculate the average of the positive numbers
        do{
            // System.out.println("Give a number:");
            num=Integer.valueOf(scanner.nextLine());
           if(num>0){
             sum +=num;
             j++;
           }
             i++;
        } while(num!=0);
        double avg =((double)sum/j);
        if(i==0){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println(avg);
        }
        // Test Pass Error ! -> On server 
    }
}
