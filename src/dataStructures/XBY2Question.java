package dataStructures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class XBY2Question {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4 };
		int[] b = { 4, 3, 2, 2, 1, 3, 3 };
		System.out.println(getSetOfDivisbleNums(a, b));
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		System.out.println(doSomething2(list));
	}
	/*
	 * Solution in Java. Assuming that the list of integers are being inputted
	 * as type Array. Function that takes two lists of integers (a[], b[]) and
	 * returns all unique elements in a, that are evenly divisible by at least
	 * half of the elements in b
	 * 
	 * 1) Iterate through each element of a, and check if a[i] % b[j] is 0 2) If
	 * 0, then increase counter. 3) If counter > b.size() /2, then add a[i] to a
	 * set (since sets in Java do not allow for duplicates) 4) Return set
	 */

	public static Set<Integer> getSetOfDivisbleNums(int[] a, int[] b) {

		int numOfDivisbleNums = 0;
		Set<Integer> setOfDivisbleNums = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] % b[j] == 0)
					numOfDivisbleNums++;
				if (numOfDivisbleNums > (b.length / 2)) {
					setOfDivisbleNums.add(a[i]);
				}
			}
			numOfDivisbleNums = 0;
		}

		return setOfDivisbleNums;
	}

	public static List<String> doSomething2(List<String> A) {
		A = (ArrayList<String>) A;
		for (int i = A.size() - 1; i >= 0; i--) {
			boolean wasFound = false;
			for (int j = i - 1; j >= 0; j--) {
				if (A.get(i) == A.get(j)) {
					A.remove(j);
					wasFound = true;
					i--;
				}
			}
			if (!wasFound) {
				A.remove(i);
			}
		}
		return A;
	}

	public static void doSomething (Hashtable dict, int depth) {
		depth= 0;
		for (Object key:dict.keySet()){
			String indent = fillStringWithChar(' ', depth);
			Object item = dict.get(key);
			if (item instanceof Hashtable) {
					System.out.println(indent + key + "=");
					doSomething(item, depth+1);
			}
			else
			{
					System.out.println(indent + key + "=" + item);
			}
		}
	}
	
	public static String fillStringWithChar(char c, int n){
		String s = "";
		for (int i = 0; i <n; i++) s+=c; 
		return s;
	}
}
