package javacert.strings;

public class MethodChaining {

	public static void main(String[] args) {
		String start = "  Java  ";
		String trimmed = start.trim();
		System.out.println("trimmed= "+trimmed);

		String lowerCase = trimmed.toLowerCase();
		System.out.println("lowerCase= "+lowerCase);
		
		String result = lowerCase.replace('j', 'J');
		System.out.println("result= "+result); //Java
		
		String anotherResult = "  Java  ".trim().toLowerCase().replace('j', 'J');
		System.out.println("anotherResult= "+anotherResult);
		System.out.println(result.equals(anotherResult)); //true
		
		String a = "abc";
		String b = a.toUpperCase();
		String c = b.replace('B', 'b').replace('C', 'c');
		System.out.println("a= "+a); //abc
		System.out.println("b= "+b); //ABC
		System.out.println("c= "+c); //Abc
		
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Strings are equal"); //will be printed
		}
		
		if (a.toLowerCase().trim().equals(b.toLowerCase().trim())) {
			System.out.println("Equal"); //will be printed
		}
	}

}
