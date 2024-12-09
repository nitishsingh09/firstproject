package stringQuestions;

import java.util.Arrays;
//import java.util.Scanner;

public class removeDuplicate {
	public static void main(String[] args) {
		
		
		String[] arr = new String[] {"n","a","s","n","a","s","p","p"};
//		int[] arr = new int[] {1,2,3,2,1,4,5,4,6,5,6};
		int n = arr.length;
		System.out.println(arr.length);
		System.out.println(arr);
		Arrays.sort(arr);
//		int[] arr1 = new int[n-1];
		String[] arr1 = new String[n] ;
		int k = 0;
		
		for(int i=0;i<n-1; i++) {
			if(arr[i]!=arr[i+1]) {
				arr1[k]=arr[i];
				k++;
				
			}
		}
		arr1[k]=arr[n-1];
		
		for(int j=0; j<=k; j++) {
			System.out.println(arr1[j]);
		}
	}

	
}
