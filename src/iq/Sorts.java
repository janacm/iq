package iq;

import java.util.Arrays;

public class Sorts {
	
	public static void main (String [] args){
		int []  arr = {1,23,42,1,4,5,6,2,3,4,16,7,8};
		System.out.println(Arrays.toString(iSortCS50(arr)));
		
	}
	
	/*
	 * code taken from cs50 YouTube video
	 */
	public static int [] iSortCS50(int [] arr){
		int element; //number we are currently moving into the sorted portion
		for (int i = 1; i< arr.length; i++){
			element = arr[i];
			int j = i; //j is the index into the unsorted portion

			/*
			 * iterating through the sorted portion from right to left. 
			 * 
			 * stop iterating, once the element to the left of our 
			 * current position is less than the element we're trying to insert
			 */
			while (j>0 && (arr[j-1] > element)){ 
				
				/*
				 * shift each element one space to the right
				 * this gives us room to insert the current element
				 * once we find the element which is less than the the current element
				 * 
				 */
				arr[j] = arr[j-1]; 
				j--; 
			}
			arr[j] = element; //insert the element
			
		}
		return arr;
	}
	public static int [] iSort(int [] arr){
		int [] sorted = Arrays.copyOf(arr, arr.length +1);
		return sorted;
	}
}
