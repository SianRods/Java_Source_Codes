
class MyException extends Exception {
    @Override

    public String getMessage() {
        return " User Defined Exception has Occured !";
    }

    @Override
    public String toString() {
        return "Custome To String has been Executed !";
    }
}

public class ThrowUserDefinedExceptions {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
