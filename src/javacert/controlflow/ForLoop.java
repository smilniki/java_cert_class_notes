package javacert.controlflow;

public class ForLoop {

	public static void main(String[] args) {
		for (int i =0;i<10;i++) {
			System.out.print(i+" ");
		}

//		System.out.println("i= "+i); //wont compile
		System.out.println();
		
		int a;
		for (a=0; a<10;a++) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("after for loop a= "+a); //is 10 
		
		//infinite loop
//		for (;;) {
//			System.out.println("hello");
//		}
		
		int x=0;
		for (int y=0, z=4; x<5 && y<10; x++, y++) {
			System.out.println("y= "+y); //0 //1 //2 //3 //4 
		}
		System.out.println("x= "+x); //x:5 y:5 z:4
		
		int d = 10;
//		for (int e=0, d=0; e<10 || d<10; e++, d--) { } //doesnt compile bc duplicate var w same name
			
//		for (long z=0,int d=4; z<10;z++,d++) {} //cant do this (diff types)
		
		for (long z=0; z<10; z++) {} //ok
		
		for (double xy=0.0; xy<10.5; xy+=0.5) {} //ok
		
	}

}
