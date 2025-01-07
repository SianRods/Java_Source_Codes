import javax.swing.plaf.synth.SynthOptionPaneUI;

public class OddEvenThreads {
	public static void main(String args[]) throws InterruptedException {
		Runnable r1 = new RunOne();
		Runnable r2 = new RunTwo();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		// Naming the Threads
		t1.setName("Evem Function");
		t2.setName("Odd Function");
		System.out.println("Thread One iS lIVE : " + t1.isAlive());
		// Default priority is Normal
		System.out.println("We are going to start a Thread ");

		// iF we want to print all the Numbers Using Different Thread for Even Odd
		// We will use the concept of Sleep which will help to print the Numbers
		// Serially from 1-100
		t1.start();
		t2.start();

	}
}

class RunOne implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class RunTwo implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
