import java.util.Scanner;

public class Exp6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the Size of the Array:");
        n=sc.nextInt();
        int arr1[]= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element "+(i+1));
            arr1[i]=sc.nextInt();
        }
        int arr2[] = new int [n];
        int sum =0;
        // Evaluating the total Sum of all the Given Array 
        for(int i=0;i<n;i++){
           sum +=arr1[i];
        }
        // Overwriting the Second array with sum 
        for(int i=0;i<n;i++){
            arr2[i] = sum ;
         }
        //  Applying the Given Condition 
         for (int i=0;i<n;i++){
            arr2[i] -=arr1[i];
         }
        //  Printing the Resultant Array 
        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
         }
    }
}
