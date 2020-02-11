package javacert.strings;

public class StringBuilderExamples {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("programming");
		String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi")); //gram
		int len = sb.length();
		char ch = sb.charAt(5);
		System.out.println(sub+" "+len+" "+ch); //gram 11 a

		StringBuilder b = new StringBuilder().append(1).append("L");
		b.append("-").append(true);
		System.out.println(b); //1L-true
		
		StringBuilder builder = new StringBuilder("programming");
		builder.insert(7, "-");
		builder.insert(2, 2);
		System.out.println(builder); //pr2ogram-ming //inserts! doesn't delete any chars
		
		builder.delete(4, 9); //(index 9 is excluded)
		System.out.println(builder); //pr2oming
		builder.deleteCharAt(2);
		System.out.println(builder); //proming
		
//		builder.delete(2, 1); //get runtime exception
		builder.delete(1, 1); //wont change anything
		
		System.out.println(builder); //^see
		
		StringBuilder sb1 = new StringBuilder("ABC123");
		sb1.reverse();
		System.out.println(sb1); //321CBA
		
		String myString = sb1.toString();
		myString = myString.toLowerCase(); //Note: toLowerCase on StringBuilder DNE
		System.out.println(myString); //321cba
		
	}

}
