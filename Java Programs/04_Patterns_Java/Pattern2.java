// package Java Programs.Patterns_Java;
/*
 Printing the Class work Aplhabetical Pattern 
     A

   CB

  EDC

 GFED

IHGFE

 */

public class Pattern2 {
    public static void main (String args[]){
        // Using Hard coded Inputs  i=5 for below
        int i,j,temp=64;
        // Controlling the row 
        for(i=1;i<=5;i++){

            // coloumn Control 
            for(j=5;j>i;j--){
                System.out.print(" ");
            }
            
            for(j=i;j>=1;j--){
                System.out.print((char)(temp+j));
            }
            temp++;
            
            System.out.println("\n");
        }
    }
    
}
