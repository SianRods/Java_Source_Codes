public class Debt {
    private double balance ;
    private double interestRate;

    public Debt(double intialBalance,double intialInterestRate){
        // Intialinzing the Instance Variables 
        this.balance=intialBalance;
        this.interestRate=intialInterestRate;

    }

    public void printBalance(){
        System.out.println(balance);

    }

    public void waitOneYear(){
        balance=balance*interestRate;
        
    }
}
