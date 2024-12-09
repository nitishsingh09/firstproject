package numbers;

import java.util.Scanner;

public class Sort012 {
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,1,0};
		int n = arr.length;
		int i, count0=0, count1=0,count2=0;
		
		for( i=0; i<n ;i++) {
			switch(arr[i]) {
			case 0:
				count0++;
				break;
			
			case 1:
				count1++;
				break;
				
			case 2 :
				count2++;
				break;
			}
			
		}
		i=0;
		while(count0>0) {
			arr[i]=0;
			count0--;
			i++;
		}
			
		while(count1>0) {
			arr[i]=1;
			count1--;
			i++;
			
		}
		while(count2>0) {
			arr[i]=2;
			count2--;
			i++;
		}
		for(int k: arr) {
			System.out.println(k);
		}
		
	
	}

}
