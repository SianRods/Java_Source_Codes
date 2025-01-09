import java.util.Scanner;
public class FinallyDemo {
    public static void main(String[] args) {
        int arr[]= new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index which you want to access ??");
        int index=sc.nextInt();
        try{
            System.out.println(arr[index]);
        }catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a.getMessage());
        }finally{
            System.out.println("This block will always get executed !");
        }
    }
}
