package numbers;

import java.util.Scanner;

public class MinOperation1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();
		System.out.println(minNum(N));
	}
	public static int minNum(int N) {
		int k = 0;
		int count = 0;
		while(N!=k) {
			if(N>0) {
				for(int i =N-k; i>0; i --) {
					if(pow2(i) || pow3(i)) {
						k=k+i;
						count++;
						break;
					}
				}
			}else {
				for(int i =N-k; i<0; i --) {
					if(pow2(i) || pow3(i)) {
						k=k+i;
						count++;
						break;
					}
				}
			}
		}
		if(N==k) {
			return count;
		}
		
		
		return -1;
	}
	
	private static boolean pow2(int n) {
		if(n<0) {
			n=n*(-1);
		}while(n!=1) {
			if(n%2!=0) {
				return false;
				
			}
			n=n/2;
		}
		return true;
	}
	
	private static boolean pow3(int n) {
		if(n<0) {
			n=n*(-1);
		}while(n!=1) {
			if(n%3!=0) {
				return false;
				
			}
			n=n/3;
		}
		return true;
	}

}
