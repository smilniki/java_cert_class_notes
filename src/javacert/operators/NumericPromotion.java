package javacert.operators;

public class NumericPromotion {

	public static void main(String[] args) {
		// promotion is converting smaller into bigger type
		int x = 5;
		double y = 10.55;
		
//		System.out.println("x+y="+x+y); //string concat happens
		System.out.println("x+y="+(x+y)); //whole result will be double bc of promotion
//		System.out.println('a'+'b');
		
		byte b = 10;
		int c = 5;
		double d = 4.5;
		
		double result = b+c+d; //no comp errors bc auto-promotion to double
		System.out.println("result= "+result); //19.5
		
		// Casting = opposite of promotion
		// casting is converting bigger to smaller type
		// (will lose precision)
		double myDouble = 5.55;
		int myInt = 4 + (int)myDouble; //decimal place is cut off/removed
		
		System.out.println("myInt= "+myInt); //9
		
		int anotherInt = 125;
		byte myByte = 15;
		
		int intResult = anotherInt+myByte; //ok
		byte byteResult = (byte)(anotherInt+myByte); //need to cast
		
		System.out.println("intResult= "+intResult);
		System.out.println("byteResult= "+byteResult); //overflow happens / wraps around to negatives O.o
		
		
	}

}
