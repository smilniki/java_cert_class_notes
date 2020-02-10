package javacert.operators;

public class EqualityOperators {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		boolean c = a == b; //this is valid //false
		boolean d = a != b; //true
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);

//		boolean g = true==5; //doesnt compile
//		boolean h = true!="test"; //doesnt compile
		
		boolean x = true;
		boolean y = false;
		boolean z = (y=true)&&(x=false); //assignments! both parts execute in this case
		
		System.out.println("x = "+x); //false
		System.out.println("y = "+y); //true
		System.out.println("z = "+z); //false
		
		
		
	}

}
