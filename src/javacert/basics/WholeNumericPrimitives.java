package javacert.basics;

public class WholeNumericPrimitives {

	public static void main(String[] args) {
		long max = 32143678932L;
		int idk = 32_1; //can't put at beg or end, though
		System.out.println(idk);
		
//		int oct = 08; //octal #s range from 0-7
		int oct = 07;
		int firstOct = 010; //apparently this is 8 in decimal
		int secondOct = 022; // '' 18 in decimal
		
		int sumOct = firstOct + secondOct;
		System.out.println("First oct: "+firstOct+", Second oct: "+secondOct);
		System.out.println("Decimal sum is "+sumOct+", Octal sum: "+Integer.toOctalString(sumOct));
	
//	hexidecimal is (0-9) and (A-F)
		int firstHex = 0xF; //15 in decimal
		int secondHex = 0x1E; //30 in decimal
		int sumHex = firstHex + secondHex;
		System.out.println("First hex: "+firstHex+", Second hex: "+secondHex);
		System.out.println("Decimal sum is "+sumHex+", Hex sum: "+Integer.toHexString(sumHex));
	
		int firstBin = 0b1001; //9 decimal
		int secondBin = 0b0111; //7 decimal
		int sumBin = firstBin + secondBin;
		System.out.println("First bin: "+firstBin+", Second bin: "+secondBin);
		System.out.println("Decimal sum is "+sumBin+", Bin sum: "+Integer.toBinaryString(sumBin));


		
		
//		For exam: need to be able to recognize valid literals, and know they can be assigned to #s
		
	}

}
