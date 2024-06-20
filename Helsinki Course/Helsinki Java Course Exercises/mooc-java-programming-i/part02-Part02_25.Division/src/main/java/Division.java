

public class Division {

    public static void main(String[] args) {
        division(3, 5);
       
    }

    public static void division(int numerator,int denominator){
        double result = (double)numerator/(double) denominator;
        // Type casting is necessary to obtain the results in the floating point numbers
        System.out.println(result);
    }


}
