public class TypesOFConstructors {
	public static void main (String args[]){
		Numerical N1 = new Numerical();
		Numerical N2 = new Numerical(33);
		Numerical N3 = new Numerical(N2);
		if(N3.ques.equals(N2.ques)){
			System.out.println("N3 Objects and N2 Objects are Both Equal ");
		}
	}
}

class Numerical{
	public int num =12;
	public double pie= 3.14;
	public String ques ="Question Number 1";

	public Numerical(){
		// Non Paramaterised Constructor 
		System.out.println("No Parameters Passes");
	}

	public Numerical(int n){
		this.num =n;
		System.out.println("Integer Parameter has been Passed");
	}

	public Numerical (Numerical n){
		// Copying all the Class variables of Another Object 
		this.num=n.num;
		this.pie=n.pie;
		this.ques=n.ques;
	}
}
