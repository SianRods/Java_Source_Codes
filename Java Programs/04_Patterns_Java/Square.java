import java.util.Scanner;
public class Square {
    public static void main(String args[]){
        int rows , cols ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows : ");
        rows =sc.nextInt();
        System.out.println("Enter the number of Coloumns : ");
        cols=sc.nextInt();

        for (int i=1;i<=rows;i++){
           for(int j=1;j<=cols;j++){
                // Printing the border of the Square 
                if (i==1 || i==rows){
                    for(int k=1;k<=cols;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                else { 
                    System.out.print("*");
                    for(int k =1;k<=cols-2;k++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            }
        }

    }
}
