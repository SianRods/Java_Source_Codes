public class DispatchingAMethod {
	public static void main (String args[]){
		Parent p1 = new Child();
		p1.getMessage();
	}
}


class Parent {
	public void getMessage(){
		System.out.println("I am Parent Class!!");
	}
}

class Child extends Parent{
	public void getMessage(){
		System.out.println("This is the Child class");
	}
}