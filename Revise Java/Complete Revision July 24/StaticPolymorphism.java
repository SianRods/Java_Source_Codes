import java.util.Scanner;

public class StaticPolymorphism{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Solution s1 = new Solution();
		s1.area(.32,43);


	}
}

class Solution{

	public void area(double radius){
		System.out.println("The area of the Mentioned Circle is : "+(3.14*radius*radius));
	}

	public void area(double len, double breadth){
		System.out.println("The area of the Mentioned Rectangle is : "+(len*breadth));
	}

	public void area(double base ,int height){	
		   System.out.println("The Area of the Triangle is : "+(0.5*base*height));
	}

}