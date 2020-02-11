package javacert.strings;

public class UnderstandingEquality {

	public static void main(String[] args) {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("Java");
		
		System.out.println(one==two); //false
		System.out.println(one==three); //true

		String x = "Java";
		String y = "Java";
		
		System.out.println(x==y); //true //Literals are pooled!
		
		String a = "Java";
		String b = " Java".trim();
		
		System.out.println(a==b); //false bc trim() method returns a new string
		
		String c = "Java";
		String d = " Ja".trim()+"va";
		
		System.out.println(c==d); //false; same deal
	}

}
