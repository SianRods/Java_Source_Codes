import java.util.Scanner;

// Deleting Element  of An Array Based on User Selection 
public class ArrayDel {
    public static void main(String args[]) {
        int index = 0, ele;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Please Enter an Array of Size 5 :");
        // Inputting Array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the Element :" + (i + 1));
            arr[i] = sc.nextInt();
        }
        
        // Printing Array
        for (int k = 0; k < 5; k++) { 
            System.out.println("The " + (k + 1) + "Element is : ");
            System.out.println(arr[k]);
        }
        System.out.println("Select the Element you want : ");
        ele = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (arr[i] == ele) {
                index = i;
            }
        }
        // Shifting all the elements to Selected Element Series
        for (int i = index; i <= 5 - 1; i++) {
            // Overwriting the Selected Elements
            arr[i] = arr[i + 1];
        }
        System.out.println("The New Updated Array is : ");
        // Printing the Updated Array
        for (int k = 0; k < 3; k++) {
            System.out.println("The " + (k + 1) + "Element is : ");
            System.out.println(arr[k]);
        }

    }
}
