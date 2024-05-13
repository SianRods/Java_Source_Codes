package PracticeThread;
import java.util.*;

class Thread1 extends Thread {

	@Override
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				System.out.println(e);
			}			
		}
	}
}

class Thread2 extends Thread {

	@Override
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println(e);
			}			
		}
	}
}


public class PracOne{
	public static void main (String args[]){
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		System.out.println(t1.getPriority());

		System.out.println(t1.getName());
		System.out.println(t2.getName());

		t1.setPriority(t1.MAX_PRIORITY);

		System.out.println(t1.getPriority());

		t1.start();
		t2.start();
	}
}