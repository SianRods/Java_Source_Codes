import java.util.*;
/*
 * Error Code- OutOfBoundsException
 * With for (int i = 0; i < data.length; i++) { if (data[i + 1] < data[i]), i+1 is outside of the array for 
 * the iteration of your loop (because it will be equal to data.length and the last valid index in
 *  your array is data.length - 1)
 * 
 * 
 */

public class LargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[4];
        for(int i =0;i<arr.length-1;i++){
            System.out.println("Enter the value of "+(i+1)+"Element");
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];
        for(int i=0;i<arr.length-1;i++){
            // Assuming the First Element as the Largest 
            if(arr[i]>lar){
                lar =arr[i];
            } else{
                continue;
            }
        }

        System.out.println("The largest is : "+lar);
    }
}
