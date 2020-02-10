package javacert.operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// div + mult have higher precedance than add + sub
		
		int result = 3-2+2*2+3;
		System.out.println("Result is: "+result);

		result = 4/2+1-4*2+10; 
		System.out.println("Result is: "+result);
	
		int a = 4;
		int b = 3-2*--a; // -- means you decrement a by 1, then use it (a=a-1)
		// if -- is after variable, you use the variable and THEN decrement it
		System.out.println("a= "+a); //3
		System.out.println("b= "+b); //-3
		
		a = 4;
		b = 3-2*a--; //use a, then decrement
		System.out.println("a= "+a); //3
		System.out.println("b= "+b); //-5
		
		long c = 2;
		long d = 4+3*c++; //use, then increment
		System.out.println("c= "+c); //3
		System.out.println("d= "+d); //10
		
		result = 10-3*(2+1)-4/(1+3);
		//10-3*3-4/4
		//10-9-1
		System.out.println("Result is: "+result);
	
		int i = 10;
		int j =3;
		
		int k = i%j; //1
		int e = 10%2; //0
		
		System.out.println("k= "+k); 
		System.out.println("e= "+e); 
		
		int f = 12;
		int g = 5;
		int h = 2;
		int m = f/2-10%(4+3)-2*f%g-h*3;
		//12/2-10%(4+3)-2*12%5-2*3 // Note: modulo/mult/div have same precedence, do left->right
		//12/2-10%7-24%5-2*3
		//6-3-4-6
		//-7
		System.out.println("m= "+m); 
	}

}
