public class Main {
    public static void main(String[] args) {
        Child c1 = new Child(12, "Hel", "Nah");

    }
}

class Parent {
    int age;
    String name;

    // default Constructor
    public Parent() {
        System.out.println("Parent Constructor is called...");
    }

    // param constructor
    public Parent(int age) {
        this.age = age;
        System.out.print("P11 is called");

    }

    public Parent(String name) {
        this.name = name;
        System.out.print("P12 is called");
    }

    public Parent(int age, String name) {
        this.name = name;
        this.age = age;
        System.out.println("P13 is called");
    }

    @Override
    public String toString() {
        return "Parent :" + name + "Age:" + age;
    }
}

class Child extends Parent {
    String childname;

    public Child(int age, String pname, String cname) {
        // super(age, pname);
        System.out.print("Child Constructor is called....");
        this.childname = cname;
    }

}