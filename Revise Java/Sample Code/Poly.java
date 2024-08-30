import java.util.*;

public class Poly{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Area a1 = new Area();
		a1.area(.32, 0.23, true);

		// This argument of passing the parameters to appt method is resovled during comile time and 
		// hence is  called as static polymorphism 

	}
}

class Area{
	// Polymorphism --> Many Forms 
	public void area(double radius){

	}
	public void area(double len, double bred){
		System.out.println("Area of Rectangle is : "+(len*bred));

	}
	public void area(double base , double height,boolean status){
		if(status){
			double sol = (0.5*base*height);
			System.out.println("The area of the RIght angled trianle is : "+sol);
		}
	}
}