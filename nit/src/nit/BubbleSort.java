package nit;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		

//	      Scanner s = new Scanner(System.in);
//	      
//	      System.out.print("Enter the Size: ");
//	      int n = s.nextInt();
//	      
//	      int[] arr = new int[n];
//	      
//	      System.out.print("Enter the elements of array: ");
//	      for(int i=0; i<n; i++) {
//	         arr[i] = s.nextInt();
//	      }
	      
		int [] arr = {45, 54,94, 55, 12};
	      
	      System.out.println("Sorting the array...");
	      for(int i=0; i<arr.length; i++){
	         for(int j=0; j<arr.length-1; j++){
	            if(arr[j]>arr[j+1]){
	               int temp = arr[j];
	               arr[j] = arr[j+1];
	               arr[j+1] = temp;
	            }
	         }
	      }
	      
	      System.out.println("The new sorted array is:");
	      
	      for(int i=0; i<arr.length; i++)
	         System.out.print(arr[i]+ " ");
	   }

}
