 // Jagged Arrays Are 2D Arrays of irregular Sizes 
        /*ex. 
         * 324
         *4657657 
          765858797*/
import java.util.Scanner;
public class JaggedArrays {
    static Scanner sc =new Scanner (System.in);
    public static void main(String args[]){
        // One of the parameter is fixed 
       int arr [][] = new int [3][];
       arr[0]= new int[2];
       arr[1]= new int [4];
       arr[2]= new int[5];

    //  Note that the Array being a referenced  Data Types One of the useful method to ac
    // Access its length is arr_name.length --> Method in java
    for(int i=0;i<2;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print("Enter the "+(i+1)+(j+1)+"Element ");
            arr[i][j]=sc.nextInt();
        }
        System.out.println("");
    }
// Displaying the jagged Arrays -->
for(int i=0;i<2;i++){
    for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]);
    }
    System.out.println("");
}
    }
}
