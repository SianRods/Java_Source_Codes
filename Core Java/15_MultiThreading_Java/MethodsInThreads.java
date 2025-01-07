
public class MethodsInThreads {
	public static void main(String args[]) {
		Runnable runObject = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world this is Me !! ");
			}
		};

		Thread t1 = new Thread(runObject);

		System.out.println(t1.getName());
		t1.setName("Ticket Booking !");
		System.out.println(t1.getName());

		// Settings Equal Priority of Two Threads

		System.out.println(t1.isAlive());

		t1.start();

		System.out.println(t1.isAlive());

	}
}