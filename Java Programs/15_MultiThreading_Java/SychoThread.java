

class Counter{
    public int count;
    public void increment(){
        count++;
    }
}

/*
 Note that we have to only create a Single object of counter which tries to accesss the count 
 with the help of two simultaneous threads 
 */
// Without Extending thread class we can create thread inside the main method

public class SychoThread {
     public static void main(String args[]){
        Counter c1 = new Counter ();

        
        
        // Using the Join Methods for Thread to be Terminated after the Execution of Thread is completed
        
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        
        System.out.println(c1.count);
        

     }
}






