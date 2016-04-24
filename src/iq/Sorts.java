package iq;

import java.util.Arrays;

public class Sorts {
	public static void main (String [] args){
		int []  arr = {1,23,42,1,4,5,6,2,3,4,16,7,8};
//		System.out.println(Arrays.toString(iSortCS50(arr)));
//		System.out.println(Arrays.toString(mergeSort(arr)));
		System.out.println(railroadPlatforms());
	}
	
	/*
	 * Merge Sort from http://howtodoinjava.com/algorithm/merge-sort-java-example/
	 */
	public static int[] mergeSort(int [] list){

		//empty list 
		if (list.length <=1){
			return list; 
		}
		
		//split array in half
		int [] first = new int[list.length/2];
		int [] second = new int[list.length - first.length];
		System.arraycopy(list, 0, first, 0, first.length);
		System.arraycopy(list, first.length, second, 0, second.length);
		
		
		//Sort each half recursively
		mergeSort(first);
		mergeSort(second);
		
		//Merge both halves together, overwriting to original array
		merge(first, second, list);
//		list=  ArrayQuestions.mergeSortedArrays(first, second);
		return list;
	}
	
	private static void merge(int [] first, int [] second, int [] result){
		int iFirst =0; //index of first array
		int iSecond =0; //index of Second array
		int iMerged =0; //index of merged array
		
		/*
		 * Compare elements at iFirst and iSecond 
		 * Move smaller element to iMerged
		 * J: ...is this any different from my ArrayQuestions.mergeSortedArrays(a, b)
		 */
		while (iFirst < first.length && iSecond < second.length){
			if (first[iFirst] < second[iSecond]){
				result[iMerged] = first[iFirst];
				iFirst++;
			}else{
				result[iMerged]=second[iSecond];
				iSecond++;
			}
			iMerged++;
		}
		System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
		System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	}
	/*
	 * Merge Sort
	 * My attempt.
	 * 
	 * 1) Split the array into pairs
//	 * 	a) What is the best way to do this?
	 */
	public static int [] janacMergeSort(int [] a){
		int [] sorted =null; 
//		ArrayQuestions.mergeSortedArrays(a, b);
		return sorted;
	}
	
	
	/*
	 * Insertion Sort
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

	/*
	 * Insertion sort
	 */
	public static int [] iSort(int [] arr){
		int [] sorted = Arrays.copyOf(arr, arr.length +1);
		return sorted;
	}
	
	
	/*
	 * Railway question which uses merging algorithm
	 */

	static int railroadPlatforms(){ 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int numOfTestCases = Integer.parseInt(br.readLine());
//		int numOftrains = Integer.parseInt(br.readLine());
//		int[] arrivals = new int[numOfTrains];
//		int[] departures = new int[numOfTrains];

		int numOfTestCases = 1;
		int numOftrains = 6;
//		int[] arrivals = {900,940,950,1100,1500,1800}; //output should be 3 
//		int[] departures = {910,1200,1120,1130,1900,2000};

//		int[] arrivals = {900,940,950};
//		int[] departures = {910,1200,1120};

		int[] arrivals = {1800,940,950,1100,1500,1800}; //output should be 3
		int[] departures = {1801,1200,1120,1130,1900,2000};

		Arrays.sort(departures);
		Arrays.sort(arrivals); 
		int platformsNeeded = 0;

		// use similar algorithm to merge sort to process the items
		int k = 0;
//		int j = 1; //since the first will always be an arrival, we don't need to compare it, we can set platforms need =1 
		int j = 0; 
		int result = 1;
		while ((j < arrivals.length) && (k < departures.length)) {
			if (arrivals[j] < departures[k]) {
				platformsNeeded++;
				j++;
				if (platformsNeeded > result)  // Update result. Remember we only need the max num of trains 
		              result = platformsNeeded;
			} else {
				platformsNeeded--;
				k++;
			}
		}
		return result;

	}
}

