package numbers;

public interface PrimeNumber {
	
	public static void main(String[] args) {
		
		
			int num = 7;
			int factor = 0;
			int i = 1;
			while(i<=num) {
				if(num%i==0)
					factor++;
				i++;	
			}
			if(factor==2) {
				System.out.println("it is prime");
			}else {
				System.out.println("it is not prime");
			}
	}
}
