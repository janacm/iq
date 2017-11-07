package iq;

import java.util.Arrays;
import java.util.Date;

public class Searches {

	public static void main(String[] args) {
//		int[] a = { 1, 3, 4, 6, 7, 8, 19, 200 };
//		 int [] a = {1,3,4};
		 int [] a = {1,2,3,4};
//		int key = 6;
		int key = 4;

		System.out.println(new Date());
		System.out.println("Binary Search" + binarySearch(key, a, 0, a.length));

	}

	/*
	 * CS 50 Solution
	 */
	public static int binarySearch(int key, int[] array, int min, int max) {
		if (max < min) {
			return -1;
		} else {
			int midpoint = findMidPoint(min, max);

			if (array[midpoint] < key) {
				return binarySearch(key, array, midpoint + 1, max);
			} else if (array[midpoint] > key) {
				return binarySearch(key, array, min, midpoint - 1);
			} else {
				return midpoint;
			}
		}
	}

	public static int findMidPoint(int min, int max) {
		return min + (max - min) / 2;
	}

	/*
	 * 1 Check the middle element 2 If greater than the middle element, check
	 * the middle of the upper half 3 Else check the middle of the lower half
	 * 
	 */
	public int binarySearchIndexOfElement(int[] a, int e) {
		int length = a.length;
		if (length % 2 == 0) {

			// if length is 1, then 1/2 = 0, checks the first and only element
			if (e == a[length / 2])
				return length;
		} else {
			if (e == a[length / 2 + 1])
				return length;
		}
		if (length == 1)
			return -1;

		System.out.println((length / 2) + 1);
		System.out.println(length - 1);

		if (e > a[length / 2]) {
			return binarySearchIndexOfElement(Arrays.copyOfRange(a, 0, (length / 2) - 1), e);
		} else {

			return binarySearchIndexOfElement(Arrays.copyOfRange(a, (length / 2), length - 1), e);
		}
	}
}
