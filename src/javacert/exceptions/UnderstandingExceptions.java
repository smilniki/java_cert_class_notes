package javacert.exceptions;

public class UnderstandingExceptions {

	//a method can handle an exception or throw it
	
	public static void main(String[] args) {
		int[] myArray = new int[2];
		System.out.println(myArray[5]); //get indexOutOfBoundsException at runtime
		
		//"something wrong in code" is subjective
		//good idea to avoid return codes (ex -1) bc makes special values...
		
		//w exceptions, forcing program to deal w exception
	}
	
}
