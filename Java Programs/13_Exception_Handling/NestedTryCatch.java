import java.util.*;

public class NestedTryCatch {
    
        
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int num [] = new int[3];
            num[0]= 42;
            num[1]=43;
            num[2]=24;
            System.out.println("Enter the value to be divided by : ");
            int b = sc.nextInt();
            System.out.println("Enter the index of Array you want to divide ");

            int i = sc.nextInt(); 
            try{

                try{
                    float l = num[i]/b;
                }
                catch(ArithmeticException a){
                    System.out.println("Arithemetic Error Has Occurerd !");
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Check the index of the array !");
                }




            } catch(Exception e)
            {
                    System.out.println(e);
            }

        }




    }

