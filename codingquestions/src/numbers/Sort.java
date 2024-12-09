package numbers;

public class Sort {
	public static void main(String[] args) {
		
		int[] arr = new int[]{ 78,34,1,3,90,34,-1,-4,6,55,20,-65} ;
		int n = arr.length;
		
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		System.out.println("");
		
		System.out.println("Minimum element of an array");
		System.out.println(arr[0]);
		
		System.out.println("maximum element in an array");
		System.out.println(arr[n-1]);
	}
}
