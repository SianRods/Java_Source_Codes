import java.util.*;

// Interface is a template that can be applied to a class which helps is acheiveing 100%  abstraction 
//  It is Similar to inheritance but specifies what a class has / or what it must do ?
// Classes Can appply more than one interface , however only one parent class / super class can be inherited
//  By a child class 

class InterfaceFirst{
    public static void main (String args[]){
        // Creating an object of the class rich 
        rich vedant = new rich();
        vedant.money();
        poor sarthak = new poor();
        sarthak.money();
    }
}

interface Details{
    void money();
    void peace();
    void ego();
}

// It is important to implement the access specifier as public 
class rich implements Details{
    public void money(){
        System.out.println("Very Rich Unlimited ");
    }
    public void peace(){
        System.out.println("No Peace at All");
    }

    public void ego(){
        System.out.println("Extremely Egoistic !");
    }
}


class poor implements Details{
    public void money(){
        System.out.println("Very Poor , NO Money ");
    }
    public void peace(){
        System.out.println("Always at inner Peace ");
    }

    public void ego(){
        System.out.println(" Always Humble ");
    }
}