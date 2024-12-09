package numbers;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int n = 153;
		int z = n;
		int count = 0;
		int sum = 0;
		
		
		while(z>0) {
			count++;
			z = z/10;
		}
		System.out.println("length of a number is : " + count);
		
		z=n;
		while(z>0) {
			
			int digit = z%10;
			System.out.println(digit);
			int mul = 1;
			
			for(int i = 0; i < count; i++) 
			mul = mul * digit;
			
		
			sum = sum + mul;
			z = z/10;
		}
		if(sum == n) {
			System.out.println("this is armstrong number");
		}else {
			System.out.println("this is not armstrong	");
			System.out.println(sum);
		}
		
		
	}
	
}
