package javacert.operators;

public class ObjectEquality {

	public static void main(String[] args) {
		// == on objects: comparing memory locations
		
		// MAIN THING: in Java, integers from -128 to 127 are pooled and they are inside the Integer class
		
		//comparing objects
		Integer myInteger = 127;
		Integer myAnotherInteger = 127;
		System.out.println(myInteger==myAnotherInteger); //true
		System.out.println(128==128); //true
		
		// they have the same hash!
		System.out.println("myInteger hash: "+System.identityHashCode(myInteger));
		System.out.println("myAnotherInteger hash: "+System.identityHashCode(myAnotherInteger));

		
		myInteger = 128; //autoboxing happens (Integer.valueOf() method called automatically)
		// new operator is used --> new objects are being created!
		myAnotherInteger = 128;

		System.out.println("myInteger= "+myInteger);
		System.out.println("myAnotherInteger= "+myAnotherInteger);
		System.out.println(myInteger==myAnotherInteger); // is FALSE
		
		Integer int1 = new Integer(1);
		Integer int2 = new Integer(1);
		Integer int3 = 1;
		
		//all 3 return false
		//these object refs are not equal
		System.out.println("int1==int2: "+(int1==int2));
		System.out.println("int1==int3: "+(int1==int3));
		System.out.println("int2==int3: "+(int2==int3));
		
		// .equals checks internal data
		System.out.println("int1.equals(int2): "+int1.equals(int2));
		System.out.println("int1.equals(int3): "+int1.equals(int3));
		System.out.println("int2.equals(int3): "+int2.equals(int3));
		
		// all hashes are different
		// why == returned false
		System.out.println("int1 hash= "+System.identityHashCode(int1));
		System.out.println("int2 hash= "+System.identityHashCode(int2));
		System.out.println("int3 hash= "+System.identityHashCode(int3));
	}

}
