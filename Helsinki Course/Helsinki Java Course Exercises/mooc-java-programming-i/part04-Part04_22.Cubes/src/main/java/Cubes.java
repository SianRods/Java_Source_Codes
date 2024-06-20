
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result =0 ;
        while(true){
            String input =scanner.nextLine();
            
            if(input.equals("end")){
                break;
            }  else{
                Integer num = Integer.valueOf(input);
                result=num*num*num;
                System.out.println(result);
            }

        }

    }
}
