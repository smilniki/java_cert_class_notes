package javacert.arrays;
import java.util.Arrays;

public class NestedLoop {

	public static void main(String[] args) {
		for (int hours=1; hours<=6;hours++) {
			for (int minutes=0;minutes<60;minutes++) {
//				System.out.println("hours: "+hours+", minutes: "+minutes);
			}
		}

		int[][] myArray = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(Arrays.toString(myArray)); //prints each row but weirdly
		
		OUTER:
		for (int[] rowArray : myArray) {
			INNER:
				for (int i=0;i<rowArray.length;i++) {
					if (rowArray[i]%2==0) {
//						break INNER; //dont need to specify bc **By default, will break first loop encountered when go up
//						break OUTER;
//						continue INNER; //cuts to next iteration of (inner) loop
//						continue OUTER;
					} 
					System.out.print(rowArray[i]+" ");
				}
		System.out.println();
		}
		
		int x = 10;
		while (x>0) {
			do {
				// 1. inner loop executes until x=5
				// 3. x-=1 ==> 3
				// 5. x-=1 ==> 1
				x-=1; 
		} while (x>5);
			// 2. x-- --> 4
			// 4. x-- --> 2
			// 6. x-- --> 0
			x--; 
			System.out.println(x); //4 2 0
		}
		
	}

}
