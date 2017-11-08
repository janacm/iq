package iq;

import java.util.Scanner;

public class HackerRank1 {

	/*
	 * Given 1 2 3 4 5, 3, 2 a = input n = num of integers d = num of rotations
	 */

	public static int[] arrayLeftRotation(int[] a, int n, int k) {
		int temp = 0;
		for (int i = 0; i < k; i++) {
			a = insertAtEnd(a, a[0]);
		}
		return a;
	}

	public static int[] insertAtStart(int[] a, int b) {
		for (int i = a.length - 1; i > 0; i--) {
			a[i] = a[i - 1];
		}
		a[0] = b;
		return a;
	}

	public static int[] insertAtEnd(int[] a, int b) {
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
			// System.out.print(Arrays.toString(a));
		}
		a[a.length - 1] = b;
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		// output = insertAtStart(a, 100);
		// output = insertAtStart(a, 101);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");

		System.out.println();

	}
}
