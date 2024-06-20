
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Intializing the ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while(true){
            int input=Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;

            }
            list.add(input);

        }

        int sum=0 ;
        // Calculating the average for the given list
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        
        double avg = (double)sum/list.size() ;
        System.out.println("Average: "+avg);
    }
}
