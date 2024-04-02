public class IntegerParse {
    public static void main(String args[]){
        int a,b,c;
        // Using the Integer Class to take Inputs
        System.out.println("Enter the Value of a :");
        // Here the input gets stored in the first index of the args string 
        a= Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        /*
         * It is important to note that direct input from the cmd can be taken 
         * Here The 'Integer represents the Wrapper Class and parseInt --> a method '
         */
        int sum = a+b;
        System.out.println("The Value of A + b is : "+sum);
    }
}
