import java.util.*;
// Using the Keyword Super in Various Ways 
public class UserSuperKey {
    public static void main(String args []){
        Child1 c1 = new Child1("Dominic","Sheela ","Sian");
        System.out.println(c1.fname);
        System.out.println(c1.mname);
        System.out.println(c1.cname);
    }
}


class Parent{
    String fname;
    String mname;

    Parent(String fname,String mname){
        this.fname=fname;
        this.mname=mname;
        // Intializing the names of Father and The Mother of the Child 
    }
}

 class Child1 extends Parent{
    String cname;
    Child1(String fname,String mname,String cname){
        super(fname,mname);
        this.cname=cname;
    }
 }