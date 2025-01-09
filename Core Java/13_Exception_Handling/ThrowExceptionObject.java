import java.util.*;

public class ThrowExceptionObject {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Area area = new Area();

		try {
			throw new AreaNotZero();
		} catch (AreaNotZero e) {
			System.out.println(e);
		}

	}
}

class AreaNotZero extends Exception {

	@Override
	public String getMessage() {
		return "Hello World !! ";
	}

	public String toString() {
		return " Area Cannot be Zero !";
	}
}

class Area {

	public double getArea(int radius) {
		return radius * radius * 3.14;
	}

	public int getArea(int length, int breadth) {
		return length * breadth;
	}

}