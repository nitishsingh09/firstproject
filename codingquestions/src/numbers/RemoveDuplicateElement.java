
package numbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateElement {
	
  
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter the size of the array");
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for (int i=0; i<n;i++) {
    		arr[i]=sc.nextInt();
    	}   
   
	    Arrays.sort(arr);  
	    
	    int[] temp = new int[n];
	    int j = 0;
	   
	    for ( int i=0; i < n-1 ; i++) {
	        if (arr[i] != arr[i+1]) {
	            temp[j] = arr[i];
	            j++;
	        }	       
	    }
	    temp[j] = arr[n-1];
	   
	    for  (int i = 0; i  <j+1; i++) {
	        System.out.println(temp[i]);
	    }
	    
	    System.out.println("----------------------------------------");
	    
	    HashSet<Integer> hs = new HashSet<>();
	    for(int i=0;i<arr.length;i++) {
	    	hs.add(arr[i]);
	    }
	    for(int num : hs){
	    	System.out.println(num);
	    }
	    
    }
    
}