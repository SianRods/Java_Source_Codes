// Priority of Thread Ranges From 1 to 10 and By default every thread has a value of 5
// Therefore we can set priority for a given thread it is important to note that  
// By doing so we are only suggesting the Scheduler of the Cpu to change the priority 
//  but it entirely depends upon the scheduler to make the necessary changes 
class A extends Thread{
    public void show(){
        for(int i=0;i<5;i++){
        System.out.println("Hello");
    }
}
}

class B extends Thread{
    public void show(){
        for(int i=0;i<5;i++){
        System.out.println("World");
    }
}
public static void main(String args[]){
}

class ThreadPriority{
        A obj1= new A();
        B obj2 = new B();
        // System.out.println(obj2.getPriority());
        // obj1.setPriority(10);
        // System.out.println(obj1.getPriority());

        obj1.setPriority(Thread.MAX_PRIORITY);

        obj2.setPriority(Thread.MIN_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
