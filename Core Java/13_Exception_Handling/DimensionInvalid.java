public class DimensionInvalid {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(-32, 11.23);
		r1.calArea();
	}
}

class Rectangle {
	public double length;
	public double breadth;

	public Rectangle(double l, double b) {
		this.length = l;
		this.breadth = b;
	}

	public void calArea() {
		try {
			if ((length<0.0 || length>20.0) ||(breadth<0.0 || breadth	>20.0)) {
				throw new DimensionInvalidException();
			}
			double area = length * breadth;
			System.out.println("The Area of this Rectanlge is :" + area);
		} catch (DimensionInvalidException d) {
			d.readMessage();
		}
		System.out.println("This is Executed Normally!");
	}
}

class DimensionInvalidException extends Exception {
	public void readMessage() {
		System.out.println("The Dimensions should be Greater than 0 and Less than 20");
	}
}
