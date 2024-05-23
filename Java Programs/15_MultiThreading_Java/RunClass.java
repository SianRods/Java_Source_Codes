
/*
We will be Implementing the concept of Threads using the Runnable Interface 
The Thread class  also implements the Runnable Interface which only has void run method 
 So by implementing the Runnable we will have to create objects of 
thread class in main class  and then pass the required objects of Runnable as a parameter 
to the Constructor of the Thread Class
 */

class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.print("*");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("ERROR 404");
            }
        }
    }
}


class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.print("/");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                System.out.println("ERROR 404");
            }
        }
    }
}


public class RunClass{
    public static void main(String args[]){

        //  Using the Compile Time Polymorphism to Refer to A and B class using the Reference of the 
        // Parent RUNNABLE Class 
        Runnable a = new A();
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        // We can't implement the above code because the objects a and b are still referfing to
        // Their main class A and B respectively . we will have to make use of 
        // Dynamic Polymorphisim/ Compile time / Dynamic Method Dispatch to create a reference tot\
        // the parent class of A which here is Runnable 

        t1.start();
        t2.start();
    }
}