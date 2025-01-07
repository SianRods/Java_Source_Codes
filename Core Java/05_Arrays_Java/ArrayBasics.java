// Syntax of an Array in Java 
/*
 * Syntax Valid 1 --> type []arrayName = new type[size ]
 * Syntax Valid 2 --> type arrayname[] =new type [size]
 * Syntax Vlaid 3 (Predefined Syntax )--> type arrayname [] ={d1,d,d3,d4,.....,dn}
 *  Point 1 --> that in Java new is the keyword which is used to allocate memory to 
 * Non-primitive Data Types 
 * Where the "Type "--> Indicates the Kind of Data types 
 * Point 2 --> Indexing in Java Starts from 0 
 * point 3 --> The Individual Elements can be Accessed By Using ex. mark[0]= same as C 
 * Array of type integer can be printed simlarly as any integer 
 * point 4--> For Long Arrays it can printed by using Loops 
 * 
 * It is not Resizable in Nature 
  */

  public class ArrayBasics{
    public static void main(String args[]){
        int[] subcode = new int[10];
        subcode[0]=96;
        subcode[1]=98;
        // Printing Elements of the array Individually 
        System.out.println(subcode[0]);
        System.out.println(subcode[1]);
    }
  }
  /*Footnotes 
   * Prdefined value stored in java for variables is =0;
   * for int =0;float=0.0; boolean = false (0);etc
   * Unlike C in java without encountering Memory Problems we can allocate user inputted 
   * array size 
   * Incase of C Preinitialised values for given set of variables  is always  garbage value
   * However it is very Important to Specify the Array Sixe while using the new Keyword 
   */