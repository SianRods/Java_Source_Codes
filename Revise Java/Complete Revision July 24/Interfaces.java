import java.util.*;

public class Interfaces {
	public static void main(String args[]) {
		Car c1 = new Car();
		c1.soundLevel();
		c1.color();
		Bike b1 = new Bike();
		b1.color();
		b1.soundLevel();
	}
}

// It helps acheive 100 % abstraction as compared to that of the Abstract
// Keyword
interface Feature {
	public void soundLevel();

	public void color();

}

class Car implements Feature {
	@Override
	public void soundLevel() {
		System.out.println("It makes Medium Sound for Efficient Engines ");
	}

	@Override
	public void color() {
		System.out.println("The Colour of this Car is Platinum Silver ");
	}
}

class Bike implements Feature {
	@Override
	public void soundLevel() {
		System.out.println("It makes very large Sound ");
	}

	@Override
	public void color() {
		System.out.println("The Colour of this bike is Black !");
	}
}