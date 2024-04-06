
import java.util.Scanner;

public class GiftTax {

    // Server is not taking the solution despite the 100% accurate tested code
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of the gift?");
        //Considering a Double value possibility 
        double giftval=Double.valueOf(sc.nextLine());
        double tax;
        if(giftval<5000){
            System.out.println("No tax!");
        }else  if(giftval>=5000 && giftval <25000){
              tax =(100+(giftval-5000)*0.08);
              System.out.println("Tax: "+tax);
        }else  if(giftval>=25000 && giftval <55000){
            tax =(1700+(giftval-25000)*0.10);
            System.out.println("Tax: "+tax);
        }else  if(giftval>=55000 && giftval <200000){
            tax =(4700+(giftval-55000)*0.12);
            System.out.println("Tax: "+tax);
        }else  if(giftval>=200000 && giftval <1000000){
            tax =(22100+(giftval-200000)*0.15);
            System.out.println("Tax: "+tax);
        }else  if(giftval>=1000000){
            tax =(142100+(giftval-1000000)*0.17);
            System.out.println("Tax: "+tax);
        }
        // System.out.println("Tax: "+tax);


    }
}
