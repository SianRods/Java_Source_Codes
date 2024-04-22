// In order to Implement the Concept of threads just Extend the class Thread 
// And now your class becomes a Thread 

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
}

class sample{
    public static void main(String args[]){
        A obj1= new A();
        B obj2 = new B();

    }
}


// The Concept of thread is used when we want to execute certaain things parallely 
// In order to start the Execution of any thread we need to use the call the start method 
// using the object of the a method the moment we call the start method from the 
// main it automatically starts the execution of a run method which is defined within that class