package PracticeQuestions;

public class CustomExceptions {
    public static void main(String args[]) {
        int marks = 121;
        try {
            if (marks < 0 | marks > 100) {
                throw new MarksInvalidException();
            }
        } catch (MarksInvalidException m) {
            System.out.println(m.getMessage());
        }
    }
}

class MarksInvalidException extends Exception {

    @Override
    public String getMessage() {
        return "The Marks Entered are out of Bound for given Subject";
    }
}