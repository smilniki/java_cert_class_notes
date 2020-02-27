package javacert.methods;

public class Counter {

	public static int count;
	public int anotherCount;
	
	public Counter() { //constructor
		count++;
		anotherCount++;
	}
	
	
	
	public static void main(String[] args) {
		Counter one = new Counter();
		Counter two = new Counter();
		Counter three = new Counter();
		Counter four = new Counter();
		
		System.out.println(count);
		System.out.println(one.count); //bad practice to access static vars from ref var...
		System.out.println(two.count);
		System.out.println(three.count);
		System.out.println(four.count);
		//^ they all output 4
		
		count++;
		
		System.out.println(count);
		System.out.println(one.count);
		System.out.println(two.count);
		System.out.println(three.count);
		System.out.println(four.count);
		//^ they all output 5
		
		System.out.println(one.anotherCount);
		System.out.println(two.anotherCount);
		System.out.println(three.anotherCount);
		System.out.println(four.anotherCount);
		//^ all 1
		
		one.anotherCount = 2;
		
		System.out.println(one.anotherCount); //2
		System.out.println(two.anotherCount); //1
		System.out.println(three.anotherCount); //1
		System.out.println(four.anotherCount); //1 
		
		
	}
}
