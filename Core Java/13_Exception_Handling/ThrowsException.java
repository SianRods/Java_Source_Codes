// Concept of Area 

// Created an userdefined exception
class RADIUSNOTNEGATIVE extends Exception {
    @Override
    public String getMessage() {
        return "Radius of Circle cannot be Negative !";
    }
}

public class ThrowsException {

    public static double area(int radius) throws RADIUSNOTNEGATIVE {

        if (radius < 0) {
            throw new RADIUSNOTNEGATIVE();
        }
        double results = 3.14 * radius * radius;
        return results;
    }

    public static void main(String args[]) {
        // double myArea = area(2);
        // System.out.println(myArea);
        // The above code will throw an error because it has not been handled using try
        // catch -block
        try {
            double myArea = area(-4);
            System.out.println(myArea);
        } catch (RADIUSNOTNEGATIVE e) {
            System.out.println("Personalized Handling ");
        }

    }

}