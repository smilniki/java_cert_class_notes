package javacert.controlflow;

public class DoWhileLoop {

	public static void main(String[] args) {
		int a = 0;
		
		do {
			a++;
		} while (false);

		System.out.println("a= "+a); //1
		
		//this wont compile! Unreachable code
//		while (false) {
//			a++;
//		}
		
		int x = 20;
		while (x>10)x--;
		
		System.out.println("x= "+x); //10
		
		
		int x2 = 20;
		
		do x2--;
		while (x2 >10);
		
		System.out.println("x2= "+x2); //10
		
		int y = 10;
		int z = 5;
		
		while (y<20) 
			y++;
			//these next 2 statements are outside of the loop!
			z+=2;
			y+=10;
			
		System.out.println("x= "+x+" ,y= "+y+" ,z= "+z); //10 30 7
		
		
		int number = 10;
		
		while (number>10) {
			number--;
		}
		
		//another infinite loop example: (gets stuck in the inner loop)
		do { 
			number--;
			while (number>5) {
				number += 1; 
			}
		} while (number<10);
		
		System.out.println("number= "+number); 
		
	}

}
