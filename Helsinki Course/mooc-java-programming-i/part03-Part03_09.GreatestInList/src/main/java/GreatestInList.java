
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        // implement finding the greatest number in the list
        // In roder to avoid indexoutofbounds exception we have to use the conspt of 
        // assuming an element as the greatest and then traversing through the loop 
        int max = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        // This solves the problem of index out of bounds exception
        System.out.println("The greatest number: "+max);
        }
    }

