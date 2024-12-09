package numbers;

public class Factorial {
	public static void main(String[] args) {
		int fact = 0;
		int num = 9;
		
		for(int i = 1;i<=num; i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);
	}

}
