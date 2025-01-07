/*
 * When we Use the Concept of Thread Sleep we have to use a try catch block because of the 
 * possible excetion which may occur unreported exception InterruptedException; must be
 *  caught or declared to be thrown
        Thread.sleep(10);
                    ^
 * 
 *  we have to use the try catch block in order to catch InterruptedException
 * Interrupted Exception is a Checked  Exception
 * 
 */

class A extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("World");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Exception occurred");
            }
        }
    }
}

public class SleepThread {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
