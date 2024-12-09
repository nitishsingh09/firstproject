package numbers;


public class MinInArray {
public static void main(String[] args) {
	int[] arr = {4,8,1,5};
	int n=arr.length;
	int temp = 0;
	
	for(int i=0;i<n;i++) {
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
	System.out.println(" ");
	System.out.println("minimum element in array is : "+ arr[0]);

	
}
}
