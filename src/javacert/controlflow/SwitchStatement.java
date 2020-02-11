package javacert.controlflow;

import java.util.Random;

public class SwitchStatement {

	public static void main(String[] args) {
		int dayOfWeek = 0;
		
		switch (dayOfWeek) {
		case 0:
			System.out.println("Monday");
			break; // need these!
		case 1:
			System.out.println("Tuesday");
			break;
		case 2:
			System.out.println("Wednesday");
			break;
		case 3:
			System.out.println("Thursday");
			break;
		case 4:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Weekend");
			//break; //optional here
		}

		Random rand = new Random();
		int c = rand.nextInt(26)+'a'; //adding offset to produce lowercase letters
		System.out.println((char)c+", "+c+": ");
		
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		case 'y':
			System.out.println("Sometimes a vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		
		
		int x = 4;
		switch (x) {
		case 5:
			break;
//		case x: //wont work
//			break;
		case 'K': //works
			break;
//		case "Test": //wont work
//			break;
		}
	}

}
