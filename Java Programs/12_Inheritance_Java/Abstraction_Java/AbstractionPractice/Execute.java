import java.util.*;

public class Execute {
	public static void main(String args[]){
		Mobile m1 = new Mobile();
		m1.GPU();
		m1.getName();
	}
}


abstract class Computer{
	abstract public void CPU();
	abstract public void GPU();
	abstract public String Manufacturer();
	public void getName(){
		System.out.println("The Name of this class is Computer !");
	}

}

class Mobile extends Computer {
	public int ram ;
	public double price ;
	@Override
	public void GPU(){
		System.out.println("I have an integrated GPU system!");
	}
	@Override
	public void CPU(){
		System.out.println("Ihave Snapdragons CPU");

	}

	public String Manufacturer(){
		return "This is Samsungs Latest Mobile Phone";
	}

}

class Laptop extends Computer{
	public int ram ;
	public double price ;
	public double weight ;
	@Override
	public void GPU(){
		System.out.println("I have an NVIDIA's GPU system!");
	}
	@Override
	public void CPU(){
		System.out.println("Ihave SnapdragonINTEL i7 CPU");

	}

	public String Manufacturer(){
		return "This is Asus Latest Gaming Laptop";
	}


}

class Tablet extends Computer{
	public int ram;
	public String colour;
	@Override
	public void GPU(){
		System.out.println("I have low power GPU system!");
	}
	@Override
	public void CPU(){
		System.out.println("I have Apple silicon CPU");

	}

	public String Manufacturer(){
		return "This is Apple's Latest Mobile iPhone";
	}

}