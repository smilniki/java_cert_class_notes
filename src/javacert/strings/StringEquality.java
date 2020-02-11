package javacert.strings;

public class StringEquality {

	public static void main(String[] args) {
		String name = "John";
		String anotherName = "John"; //same ref as name in pool
		String john = "Jo"+"hn"; //"John"
		String newName = new String("John"); //new is creating a new object on heap space
		
		// Note: string pool != heap space!!!! not the same thing
		
		//new strings --> java first checks if its in the pool
		//if not, is added to pool & reference created
		
		//pool was created for opt purposes
		
		//== checks references
		System.out.println("name==anotherName --> "+(name==anotherName)); //true; same ref
		System.out.println("john==name --> "+(john==name)); //true
		System.out.println("name==newName --> "+(name==newName)); //false
	
		// .equals checks data
		//all are true
		System.out.println("name.equals(anotherName) --> "+(name.equals(anotherName)));
		System.out.println("name.equals(john) --> "+(name.equals(john)));
		System.out.println("name.equals(newName) --> "+(name.equals(newName)));
	
		//first 3 have same hashcode! why == had that result
		System.out.println("name-identityhashcode --> "+System.identityHashCode(name));
		System.out.println("anotherName-identityhashcode --> "+System.identityHashCode(anotherName));
		System.out.println("john-identityhashcode --> "+System.identityHashCode(john));
		System.out.println("newName-identityhashcode --> "+System.identityHashCode(newName));

		
		String str1 = "abc"; //added to pool
		String str2 = "ab"; //added to pool
		String str3 = str2+"c"; //completely new string
		
		System.out.println(str1==str2); //false
		System.out.println(str1==str3); //also false!
		
		//different:

		String str1b = "abc"; //added to pool
		String str2b = "ab"; //added to pool
		String str3b = "ab"+"c"; //points to guy in pool
		
		System.out.println(str1b==str2b); //false
		System.out.println(str1b==str3b); //true
		
	}

}
