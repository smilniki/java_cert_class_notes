package javacert.arrays;

import java.util.Arrays;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// java is row-major, aka, rows are first
		
		//1d array
		int[] myArray = {0,1};
		
		//2d array
		int[][] array = new int[2][4]; //2 rows, 4 cols
		
		int anotherArray[][] = new int[2][4];
		
		//confusing thing:
		int[] myIntArray[] = new int[2][4]; //dont do this! 
		
		String[][] my2dArray = new String[][] {
			{"One", "Two"}, //1st row 2 elements
			{"Three", "Four", "Five"}, //2nd row, 3 elements
			{"Six", "Seven", "Eight", "Nine"}, //3rd row, 4 elements
			null //4th row null array no elements
		};
		
		int[][] numberTable = new int[2][3];
		numberTable[0][0] = 1;
		numberTable[0][1] = 2;
		numberTable[0][2] = 3;
//		numberTable[0][3] = 4; //runtime exception
		
		//3d array :O
		//pages(planes), rows, columns
		int[][][] threeArray = new int[3][3][3]; //like a rubix cube :O
		int oneMoreThreeArray[][][] = new int[3][3][3];
		
		//confusing thing:
		int[] anotherThreeArray[][];
		
		int[][][] threeDArray = {
				{{1,2,3}, {4,5,6}, {7,8,9}}, //1st plane/page w 2d array
				{{10,11,12},{13,14,15},{16,17,18}},
				{{19,20,21},{22,23,24},{25,26,27}}
		};
		
	}

}
