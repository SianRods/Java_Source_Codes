
// package Revise;

/*
 * Static methods/variables ==> can be accessed by Objects of the class
 * Non Static Methods ==> cannot be accessed by the static fields 
 * 
 */

public class MethodTypes {

    public static void main(String[] args) {

        Stats st = new Stats();
        System.out.println(st.given);
        st.world();
    }
}

class Stats {
    static int given = 12;
    public String name = "";

    public static void world() {
        System.out.println(given);
        System.out.println("this is a static world....");
    }

}