package numbers;

public class SumOfAll {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,5,7,20,2,-2};
		int n = arr.length;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
	
	
		for(int i = 0;i<n;i++) {
			for(int j =0;j<n-1;j++) {
				int temp;
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("min element in an array :  " +arr[0]);
		System.out.println("max in an array : " +arr[n-1]);
	}

}
