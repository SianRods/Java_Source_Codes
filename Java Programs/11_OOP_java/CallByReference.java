public class CallByReference {
	public static void main (String args []){
		ComplexNumber c1 = new ComplexNumber(23.32, -32.32);
		System.out.println(c1.Addition(new ComplexNumber(-32.323, -98.43)));

	}
}

class ComplexNumber {
	public double real;
	public double imaginary;
	public ComplexNumber(double realPart,double imaginaryPart ){
		this.real=realPart;
		this.imaginary=imaginaryPart;
	}

	public ComplexNumber Addition (ComplexNumber co){
		double real = this.real+co.real;
		double imag = this.imaginary+co.imaginary;

		return new ComplexNumber(real, imag);
	} 


	@Override
	public String toString(){
		return this.real+"+i"+this.imaginary;
	}
}
