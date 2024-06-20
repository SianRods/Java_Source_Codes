
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date1 = new SimpleDate(30, 12, 2011);
        date1.afterNumberOfDays(5);
        System.out.println(date1.afterNumberOfDays(5));   //RETURNS AN OBJECT
    }
}
