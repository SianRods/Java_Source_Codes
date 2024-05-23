import java.util.*;

public class MultiThreadedFibonacci {
	public static void main(String args[]) throws InterruptedException {
		Input i1 = new Input();
		i1.readLimit();
		i1.t1.start();
		i1.t1.join();
		i1.Display();
	}
}

class Input {
	Scanner sc = new Scanner(System.in);
	public int limit;
	int arr[] ;

	public void readLimit() {
		System.out.println("Enter the Limit for Fibonacci Series ");
		limit = sc.nextInt();
		arr= new int[limit];

	}

	Thread t1 = new Thread(new Runnable() {
		@Override

		public void run() {
			arr[0] = 0;
			arr[1] = 1;
			for (int i = 2; i < arr.length; i++) {
				arr[i] = arr[i - 2]+arr[i - 1]  ;
			}
		}

	});

	public void Display() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}