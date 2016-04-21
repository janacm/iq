package iq;

import java.io.*;
import java.math.*;

public class IntegerManipulation {
	public static void main(String[] args) throws Exception {
		findDigits();
	}

	public static void findDigits() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfTestcases = Integer.parseInt(br.readLine());
		int[] testCases = new int[numOfTestcases];
		for (int i = 0; i < numOfTestcases; i++) {
			testCases[i] = Integer.parseInt(br.readLine());
		}

		/*
		 * For each test case, get the number of digits, check if each digit
		 * divides N evenly.
		 */

		for (int testCase : testCases) {
			int numOfDivisors = 0;
			int numOfDigits = 0;

			// find number of digits in testCase
			int currentQuotient = testCase;

			while (currentQuotient > 0) {
				currentQuotient = currentQuotient / 10;
				// System.out.println("cq" + currentQuotient);
				numOfDigits++;
			}

			for (int d = 0; d < numOfDigits; d++) {
				int currentDigit = ((int) (testCase % Math.pow(10, (d + 1))) / (int) (Math.pow(10, (d))));
				if ((currentDigit != 0) && (testCase % currentDigit) == 0)
					numOfDivisors++;
			}
			System.out.println(numOfDivisors);
		}
	}
}
