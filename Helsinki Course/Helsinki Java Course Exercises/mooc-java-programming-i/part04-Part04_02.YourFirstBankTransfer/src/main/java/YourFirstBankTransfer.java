
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account a1 = new Account("Matthews account", 1000);
        Account a2 = new Account("My account", 0)  ;

        a1.withdrawal(100.0);
        a2.deposit(100.0);
        // Printing Both the accounts statment 
       System.out.println(a1.toString()); 
       System.out.println( a2.toString());
    }
}
