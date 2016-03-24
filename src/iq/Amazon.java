package iq;

import java.util.Arrays;

public class Amazon {
	public static void main (String [] args){
		int [] arr = {1,32,3,14,5};
//		System.out.println(Arrays.toString(reverseArray(arr)));
		System.out.println(Arrays.toString(sortArray(arr)));
	}
	public static int[] reverseArray(int [] arr){
//		int i, temp, originalLen = arr.length; //error
		int temp, originalLen = arr.length;
		int len = originalLen;
		for (int i = 0; i<originalLen/2; i++){
			temp = arr[len-1];
			arr[len-1] = arr[i];
			arr[i]=temp;
//			len +=1; //error
			len -=1;
		}
		return arr;
	}
	
	public static int[] sortArray(int arr[]){
		int i, max, location, j , temp, len = arr.length;
		for (i =0; i<len; i++){  
			max = arr[i];
			location = i;
			for (j=i; j<len; j++){
				if (max >arr[j]){
					max = arr[j];
					location=j;
				}
			}
			temp = arr[i];
			arr[i] = arr[location];
			arr[location] = temp;
		}
		return arr;
	}
}
