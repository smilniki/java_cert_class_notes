package javacert.classdesign;

public class Complex {
	private final double real;
	private final double imaginary;
	
	//final --> only way to set is through constructor
	
	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public Complex plus(Complex b) {
		double newReal = real + b.real;
		double newImaginary = imaginary + b.imaginary;
		return new Complex(newReal, newImaginary);
	}
	
	public Complex minus(Complex b) {
		double newReal = real - b.real;
		double newImaginary = imaginary - b.imaginary;
		return new Complex(newReal, newImaginary);
	}
	
	public Complex times(Complex b) {
		double newReal = real * b.real - imaginary * b.imaginary;
		double newImaginary = real * b.imaginary + imaginary * b.real;
		return new Complex(newReal, newImaginary);
	}
	
	public static Complex plus(Complex a, Complex b) {
//		double real = a.real + b.real;
//		double imaginary = a.imaginary + b.imaginary;
//		return new Complex(real, imaginary);
		return a.plus(b);
	}
	
	 public static void main(String[] args) {
		Complex a = new Complex(5.0, 6.0);
		Complex b = new Complex(-3.0, 4.0);
		
//		Complex bPlusA = b.plus(a);
		Complex bPlusA = plus(a,b);
		
		System.out.println("a real="+a.real+", a imaginary="+a.imaginary);
		System.out.println("b real="+b.real+", b imaginary="+b.imaginary);
		System.out.println("bPlusA real="+bPlusA.real+", bPlusA imaginary="+bPlusA.imaginary);
	 }
}
