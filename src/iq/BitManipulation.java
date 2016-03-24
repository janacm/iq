package iq;

//import java.math.*;

public class BitManipulation {
	public static void main (String [] args){ 
//		int decNum = 257; 
		int decNum = 3; 
		System.out.println(convertToBinary(decNum));
	}
	
	/*
	 * Incomplete
	 * This method tries to convert a number from decimal to binary
	 * without using Integer.toBinaryString
	 * 
	 * Given a number 257
	 * if even, log by 2 (get number of ones)
	 *  - wait this doesn't make sense. log 10 is 3.3219, and is 1010 in bin
	 *  - i should go go backwards, maybe use the ceil of the log to get the largest 
	 *  power of 2 I should use, and the subtract my way down, building a binary string
	 * else 
	 */
	public static int convertToBinaryUsingMathLib(int decNum){
		int binNum = 0b0;
		double numLog2 =0;
		String s = "1111";
		if (isEven(decNum)){
			numLog2 = Math.log(binNum)/Math.log(2);
		 }
		
		for (int i =0; i<numLog2; i++){
			
			
		}
		return Integer.parseInt("1110");
	}
	
	public static int convertToBinary(int decNum){
		return Integer.parseInt(Integer.toBinaryString(decNum));
	}
	public static boolean isEven(int n){
		return n%2==1;
	}
}
