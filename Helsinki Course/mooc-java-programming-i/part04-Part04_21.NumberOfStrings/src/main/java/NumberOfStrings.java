
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String line =scanner.nextLine();
            System.out.println(line);
            if(line.equals("end")){
                break;
            }
        }

    }
}
