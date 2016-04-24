package iq;

import java.util.Arrays;

public class ArrayQuestions {
	public static void main (String [] args){
//		Integer [] a = {1,2,3,4,5,null, null}; 
//		System.out.println(Arrays.toString(shiftArrayByOne(a, 1)));
		
		int [] a = {1, 3, 5};
		int [] b = {2, 4, 6};
		int [] result=null;
		result = mergeSortedArrays(a, b);
		System.out.println(Arrays.toString(result));
		
	}

	/*
	 * Merge two sorted arrays
	 */
	public static int[] mergeSortedArrays(int [] a, int b [] ){
		int [] sorted = new int [a.length + b.length];
		int i=0;
		int j=0;
		int k=0;

		while (i < a.length && j < b.length){
			if (a[i] < b[j]){
				sorted[k++] = a[i];
				i++;
			}else{
				sorted[k++] = b[j];
				j++;
			}
		}
		
		if (i != a.length){
			System.arraycopy(a, j, sorted, k, a.length - i);
		}else if (j != b.length){
			System.arraycopy(b, j, sorted, k, b.length - j);
		}
		return sorted;
	}
	/*
	 * Given an array 1,2,3,4,5,null
	 * Output: null,1,2,3,4,5
	 * Strategy: 
	 * 1) Set i as the index of the last value in the array
	 * 2) 
	 */
	public static Integer[] shiftArrayByOne(Integer a[], int from){
		int i = a.length-1;
		while (a[i] == null){
			i--;
		}
		i++;
		while (i != from){
			a[i] = a[i-1];
			i--;
		}
		a[from] = null;
		return a;
	}

}
