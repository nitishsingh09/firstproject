package numbers;

public class SquareAndSort {
	
	
	public static void main(String[] args) {
		int temp;
		int[] arr = { 5,-3, 1,-2, 6 } ;
		int n = arr.length;
		System.out.print("square array : ");
		for(int i = 0; i<n; i++) {
			
			arr[i] = arr[i]*arr[i]; 
			System.out.print(arr[i]+" ");
			 
		}
		
		System.out.println(" ");
		
		System.out.print("sorted array : ");
		for(int i=0; i<n-1;i++) {
			for(int j=0;j<n-1;j++) {  
				if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
	}
}
