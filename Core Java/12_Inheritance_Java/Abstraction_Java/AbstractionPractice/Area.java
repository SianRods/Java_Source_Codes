import java.util.*;

abstract class AreaObjects {
	abstract public double AreaCircle(double radius);

	abstract public double AreaRectangle(double length , double breadth );

	abstract public double AreaSquare(double side );

}

class AreaCalculator extends AreaObjects {

	public double AreaCircle(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}

	public double AreaRectangle(double length, double breadth) {
		double rect = length * breadth;
		return rect;
	}

	public double AreaSquare(double side) {
		double sqr = side * side;
		return sqr;
	}

}

public class Area {
	public static void main(String args[]) {
		AreaCalculator c = new AreaCalculator();

		System.out.println(c.AreaCircle(3.43));
		System.out.println(c.AreaSquare(4));

	}
}