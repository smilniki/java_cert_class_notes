package javacert.methods;

public class ReturningDataFromMethods {

	public static int number(int number) { //yuck
		number++;
		return number;
	}
	
	public static String word(String word) {
		word = word +"a";
		return word;
	}
	
	public static void main(String[] args) {
		//getting data back from a method easier than parameter stuff
		
		//copy is returned
		
		int number = 2;
		String word = "xyz";
		
		number(number); //result ignored in this case
		
		word = word(word); //reassigning var
		
		System.out.println(number+word); //2xyza
		

	}

}
