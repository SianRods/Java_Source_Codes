
import java.util.ArrayList;
import java.util.Scanner;
// Compilation FAILED ON SERVER
public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        // Using ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int num =Integer.valueOf(scanner.nextLine())
            list.add(num);
            if(num==9999){
                break;
            }
        }

        int min=list.get(0);

        for(int i=0;i<list.size();i++){
            if (list.get(i)<min) {
                min=list.get(i);
                
            }
        }
        System.out.println("Smallest number: "+min);
        int index;
        for(int i=0;i<list.size();i++){
            if(min==list.get(i)){
                System.out.println("Found at index: "+i);
            }
        }

        
    }
}
