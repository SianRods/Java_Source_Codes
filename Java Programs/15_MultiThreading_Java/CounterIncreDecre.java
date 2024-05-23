public class CounterIncreDecre {

	public static void main(String args[]) throws InterruptedException {
		Counter c1 = new Counter();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c1.incrementCounter();
					try {
						Thread.sleep(0);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c1.incrementCounter();
					try {
						Thread.sleep(0);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		});

		t1.start();

		t2.start();
		t1.join();
		t2.join();
		System.out.println(c1.count);

	}

}

class Counter {
	public int count = 0;

	synchronized public  void incrementCounter() {
		this.count = this.count + 1;
		
	}

	public synchronized void decrementCounter() {
		this.count = this.count - 1;
	}
}