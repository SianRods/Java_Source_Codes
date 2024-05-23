public class SuperConstructors {
	public static void main (String args[]){
		B b1 = new B(2);
		b1.printMessage();
	}
}

class A {
	public A(){
		System.out.println("This is an Empty Constructor of A ");
	}

	public A(int num){
		System.out.println("This is a Parameterised Constructor of A");
	}
	public void printMessage(){
		System.out.println("Hello People I am A !");
	}
}

class B extends A{
	public B(){
		System.out.println("This is an empty Constructor of B ");
	}

	public B(int option){
		super(234);
		System.out.println("This is an Parameteirsed const of B ");
	}
	@Override
	public void printMessage(){
		System.out.println("Hello i am B ");
	}
}
