package PracticeQuestions;

import java.util.Scanner;

public class InterfaceException implements TestCode {
    @Override
    public String printMessage() throws ArithmeticException {
        return "Hello World this is a method which will throw AirthmeticException and needs to be handled";
    }

    public static void main(String[] args) {
        InterfaceException i = new InterfaceException();
        System.out.println(i.printMessage());
    }
}

interface TestCode {
    String printMessage() throws ArithmeticException;
}
