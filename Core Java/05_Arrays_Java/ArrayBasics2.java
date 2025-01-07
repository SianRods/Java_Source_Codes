import java.util.Scanner;
// Find the index at which a user selected array has been stored 
public class ArrayBasics2
 {
    public static void main(String args[]){
        int ele, index =0;
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[5];
        System.out.println("Please Input The Array of Size 5");
        //Inputting Array
        for (int i=0;i<5;i++){
            System.out.println("Enter the Element :"+(i+1));
            arr[i]=sc.nextInt();
        }
        // Printing Array
        for(int k=0;k<5;k++){
            System.out.println("The "+(k+1)+"Element is : ");
            System.out.println(arr[k]);
        }
        System.out.println("Select the Element you want : ");
        ele=sc.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]==ele){
                // Removing the value of an Array by traversing through each element of an Array
               index =i;
            }
        }
        System.out.println("The Element you have Entered is at :  "+(index+1)+"Position");
    }
}
