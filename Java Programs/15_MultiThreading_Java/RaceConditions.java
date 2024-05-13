class TicketBooking {
	public int tickAvail=10;
	public int bookedConfirmed ;

	public int count;


	public  void tickBooked(){
		if(tickAvail>0){
			tickAvail= tickAvail-1;
			bookedConfirmed++;
		}else if (tickAvail<=0){
			count ++;
			tickAvail=0;
		}
	}

}


public class RaceConditions {

	public static void main(String args[]) throws InterruptedException{

		TicketBooking ticket = new TicketBooking();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run(){
				for(int i=1;i<=20;i++){
					ticket.tickBooked();
					System.out.println(ticket.tickAvail);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				System.out.println("Thread 1 is Dead!!");
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run(){
				for(int i=1;i<=3;i++){
					ticket.tickBooked();
					System.out.println(ticket.tickAvail);
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						System.out.println(e);
					}
				}
				System.out.println("Thread 2 is Dead !!");
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("Number of Tickets Left is : "+ticket.tickAvail);
		System.out.println("Number of tickets Booked for Confirmation = "+ticket.bookedConfirmed);
		System.out.println("Number of Passenger in Waiting list are ="+ticket.count);
	}
}