package numbers;

import java.util.Iterator;

public class DuplicateNeg {
	
	public static void main(String[] args) {
		
		int arr[] = {0,1,0,1,0,0,0,1,0,1,2,2};
		int n = arr.length;
		int[] temp = new int[n];
		int k = 0;
		int tem;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
		}
		
		for(int i =0; i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[k]=arr[i];
				k++;
			}else {
				temp[k]=-1;
				k++;
			}
		}
		temp[k] = arr[arr.length-1];
		
		
		for (int i = 0; i <= k; i++) {
			System.out.print (temp[i]+ " ");
		}	
	}
}
