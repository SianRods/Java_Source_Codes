import java.util.*;
// Printing Multiplication Table in Java Using For Loops 
public class Loop1 {
    public static void main(String args[]){
        // Constrain for 2<= n<= 20 
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly Enter Any Integer from 2 to 20 ");
        int n = sc.nextInt();
        if (n>=2 && n<=20) {
            int result ;
            for(int i=1;i<=10;i++){
                result = n*i;
                System.out.println(n+"x"+i+"="+result);
                result = 0;
            }
        }else {
            System.out.println("Kindly Enter the Number Within the Required Range ");
        }
    }
}
