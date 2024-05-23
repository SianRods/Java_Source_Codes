// package Java Programs.Patterns_Java;

public class NumberOddTriangle {
    public static void main ( String args[]){
        int i,j;
        // Assuming i=7ṇ
        for (i=1;i<=7;i++){
            int temp =0;
            for (j=i;j>=1;j--){
                // Using the Concept of Odd Even Rows 
                if (i%2!=0){
                    
                    System.out.print(i-j+1+temp);
                    System.out.print(" ");
                    temp++;
                    

                } else if (i%2==0){
                    System.out.print(j);
                    System.out.print(" ");
                }

            }
            System.out.print(" \n");
        }

    }
    
}
