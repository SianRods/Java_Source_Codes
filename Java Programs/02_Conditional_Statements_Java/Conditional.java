import java.util.Scanner;

public class Conditional {
    public static void main(String args[]) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first Number : ");
        a= sc.nextInt();
        System.out.println("Please enter the Second Number : ");
        b= sc.nextInt();
        c= a+b;
        if(c>15){
            System.out.println("The Resultant Value is Greater 15 and is equal to : "+c);
        }


    }
}
