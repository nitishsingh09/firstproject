package numbers;

public class Fibonnaci {
	
	
	 public static int fibonacci(int count) {
			if (count <= 1)
				return count;

			return fibonacci(count - 1) + fibonacci(count - 2);
		}
	
	public static void main(String[] args) {
//		int n1=0,n2=1,n3=0,i,num=5;
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		for(i=2;i<num;i++) {
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.println(n3+" ");
//		}	
		
		int num = 10;

    	System.out.print("A Fibonacci sequence of " + num + " numbers: ");

    	for (int i = 0; i < num; i++) {
      	    System.out.print(fibonacci(i) + " ");
    	}

		
	}
}
