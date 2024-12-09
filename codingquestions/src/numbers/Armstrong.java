package numbers;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
		int num =1;
		int temp = num;
		int count=0;
		int num1 = 0;
		
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		
		temp=num;
		
		while(temp>0) {
			int digit = temp%10;
			int product = 1;
			
			for(int i=0; i<count; i++)
				product = product * digit;
			
			num1 = num1 + product;
			
			temp=temp/10;
					
		}
		if(num==num1) {
			System.out.println("this is armstrong number");
		}else {
			System.out.println("this is not armstrong number");
		}
	}
}
