package ctci;

import java.util.Arrays;

public class ArraysAndStrings {

	/*
	 * Determine if string is unique, without other data structures
	 * 
	 * Strategy: Iterate and compare every value. Space O(1) Time O(n^2) aabd
	 * 
	 */
	boolean q11_IsUnique(String s) {
		boolean isUnique = true;

		for (int i = 0; i < s.length() - 1; i++) {
			for (int k = i + 1; k < s.length(); k++) {
				if (s.charAt(i) == s.charAt(k)) {
					isUnique = false;
					return isUnique;
				}
			}
		}

		return isUnique;
	}

	/*
	 * Determine if s1 is a permutation of s2
	 * 
	 * 1) Use a boolean flag array mapped to ASCII, for each string.
	 * 
	 * 2) flag each item as true if the char matches do this for both strings
	 * 
	 * 3) verify the boolean flag arrays are equal
	 */
	public boolean q12_IsPermutation(String s1, String s2) {
		boolean isPermutation = false;
		if ((s1 == null) || (s2 == null) || (s1.length() != s2.length())) {
			return isPermutation;
		}

		boolean[] char_set1 = new boolean[128];
		boolean[] char_set2 = new boolean[128];

		for (int i = 0; i < s1.length(); i++) {
			char_set1[s1.charAt(i) -65] = true;
			char_set2[s2.charAt(i) -65] = true;
		}

		if (Arrays.equals(char_set2, char_set1)) {
			return isPermutation = true;
		}

		return isPermutation;
	}

}