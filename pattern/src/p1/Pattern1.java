package p1;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		
		
		
		for(int i = 0; i<x; i++) {
			
			for(int j = 0; j < x-i-1; j++) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println(" ");
		}
		
	}
}
