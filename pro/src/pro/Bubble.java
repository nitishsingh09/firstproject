package pro;

import java.util.Scanner;

public class Bubble {
	
	 static void bubbleSort(int[] x, int n) {
		 int temp;
		 for (int i = 0; i<x.length; i++) {
			 for (int j = 0; j<x.length-1; j++) {
				 if(x[j] > x[j+1]) {
					 temp = x[j];
					 x[j] = x[j+1];
					 x[j+1] = temp;
				 } 
			 }
		 }
		 for (int k : x) {
			 System.out.println(k);
		 }
//		 printArray(x,n);
	 }
	 static void printArray(int[] arr, int n) {
		 for(int i : arr) {
			 System.out.println(i);
		 }
	 }
	
	 public static void main(String[] args) {
		 
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your array size");
		int n =  sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<n; i++) {
			 arr[i] = sc.nextInt();
	    }
		bubbleSort(arr, n);
		
		
		
		
		

	}

}
