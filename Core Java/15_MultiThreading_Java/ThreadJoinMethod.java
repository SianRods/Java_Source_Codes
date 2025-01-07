// THE JOIN METHOD OF THE THREAD CLASS ALLOWS A SINGLE THREAD TO FINISH FIRST 
//  AND THEN STARTS THE EXECUTION OF ANOTHER THREAD 
// IT IS IMPORTANT TO NOTE THAT THREADS ARE INDIVIDUAL PEICE OF CODES WHICH RUN INDEPENDENTLY AND 
// SIMULTANEOSLY . IF ANYONE OF THE THREAD ENCOUNTERS EXCEPTION THE OTHER ONE WON'T BE AFFECTED 
// AT ALL 


// RACE CONDITIONS IN JAVA 
public class ThreadJoinMethod {
	// WRITING THE THREADS INSIDE MAIN METHOD IT SELF 
	// WE CAN PASS A RUNNABLE ONJECT AS AN ARGUMENT TO THREAD 
	

	public static void main (String args []) throws InterruptedException {
	
		Counter c1 = new Counter();

		//  WRRITING THRED NO 1 
		Thread t1 = new Thread(new Runnable() {
			
			@Override public void run(){
				for(int i=1;i<=10;i++){
					c1.Increment();
					System.out.println(c1.count);
					try{
					Thread.sleep(50);
					}catch(Exception e){
						System.out.println(e);
					}
				}
				System.out.println("Thread "+"t1.getName()"+"has died !!");
			}
		});

		// WRITING THREAD NO 2 

		Thread t2 = new Thread(new Runnable() {
		
			@Override public void run(){
				for(int i=1;i<=10;i++){
					c1.Increment();
					System.out.println(c1.count);
					try{
					Thread.sleep(50);
					}catch(Exception e){
						System.out.println(e);
					}
				}
				System.out.println("Thread "+"t2.getName()"+"has died !!");
			}
		});

		t1.start();
		// t1.join();
		t2.start();

	}
}


//  IMPLEMENTING A SECOND CLASS 
// IN ORDER TO OVERCOME RACE CONDITION WE HAVE TO MAKE THE METHOD THREAD SAFE 

class Counter {
	public int count =0;
	synchronized public void Increment (){
		count++;
	}
}