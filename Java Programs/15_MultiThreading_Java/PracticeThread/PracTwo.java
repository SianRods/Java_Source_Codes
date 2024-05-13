
// SOME OF THE EXECUTIONS SHOULD BE ACHEIVED USING THE TRIAL AND ERROR METHOD 

class A implements Runnable{
	// Implementing the Only Method In Runnable 

	public void run(){
		for (int i=0;i<5;i++){
			System.out.print("*");
			try {
				Thread.sleep(5);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


class B implements Runnable{
	// Implementing the Only Method In Runnable 

	public void run(){
		for (int i=0;i<5;i++){
			System.out.print("/");
			try {
				Thread.sleep(5);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


public class PracTwo{
	public static void main (String args[]){
		Runnable one = new A();
		Runnable two = new B();

		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);

		// Here we have to use the Thread.NORM_PRIORITY --> 
		// NORM_PRIORITY IS THE FINAL VARIABLE OF THE THREAD CLASS 

		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
	}
}