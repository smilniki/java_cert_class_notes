package javacert.methods;

import java.util.Arrays;

public class OverloadingMethods {

	//overloaded methods can also have diff return types, access modifiers
	
	public void walk(int miles) {}
	
	public void walk(short feet) {}
	
	public boolean walk() {return false;}
	
	void walk(int miles, short feet) {}
	
	public void walk(float miles) {}
	
//	public int walk(float mileswooo) {} //leads to comp error bc method w same name + args
	
//	public static void walk(float miles) {} //also wont compile
	
	public void walk(int[] lengths) {} //ok
	
//	public void walk(int...is vars) {} // wont compile...is same as above...
	
	public static void run(int length) {}
	
	public static void run(Integer length) {}
	
	public static void run(double km) {}
	
	public static void jump(String s) {
		System.out.println("String");
	}
	
	public static void jump(Object o) {
		System.out.println("Object");
	}
	
//	public static int sum(int a, int b) {
//		System.out.println("int sum");
//		return a + b;
//	}
	
//	public static long sum(long a, long b) {
//		System.out.println("long sum");
//		return a + b;
//	}
	
//	public static Integer sum(Integer a, Integer b) {
//		System.out.println("integer sum");
//		return a + b;
//	}
	
	public static int sum(int... nums) {
		System.out.println("var args sum");
		int sum = 0;
		for (int i:nums) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
//		Arrays.toString
		
		run(1); //int method called
		run(1.0); //double method called
		
		run(9l); //ok bc long promoted to larger prim type (double in this case)
		
		jump("test");
		jump(25); //int is autoboxed to Integer, which is cast to Object

		sum(1,2); //int method called...comment that out--> long method called
		// ...comment that out --> Integer method called
		// ...comment that out --> var arg method called
		
	}

}
