package numbers;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n = sc.nextInt();
		
		int i =1;
		int factor= 0;
	
		
		
		
		
		for(;i<=n;i++) {
			if(n%i==0) {
				factor++;
			}
		}
		
		if(factor==2) {
			System.out.println("this is prime number");
		}else
			System.out.println("this is not prime number");
		
		
	}
}
