package numbers;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {
		
		int[] arr = {1,1,2,5,4,5,8,4,2};
		
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j] =arr[i];
				j++;
			}	
		}
		
		temp[j] = arr[n-1];
		
		for(int i=0;i<j+1;i++) {
			System.out.println(temp[i]);
		}
	}
}
