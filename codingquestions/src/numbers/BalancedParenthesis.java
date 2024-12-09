package numbers;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
	
	static boolean balancedParenthesis(String str) {
		Stack<Character> s = new Stack<>();
			for(int i = 0; i<str.length();i++) {
				char  c = str.charAt(i);
				if( c == '(' || c== '{' || c == '[') {
					s.push(c);
				}
				else {
					if(s.isEmpty()) {
						return false;
					}
					else if(! matching(s.peek(),c)) {
						return false;
					} else 
						s.pop();
				}
				
			}
			return s.isEmpty();
	}
	static boolean matching(char a, char b) {
		return  ((a=='(' && b == ')') || (a == '{' && b == '}') ||( a == '[' && b == ']'));
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the parenthesis");
		String s = sc.next();
		
		if(balancedParenthesis(s)) {
			System.out.println("this is valid parenthesis");
		}else {
			System.out.println("this is not valid parenthesis");
		}
	}
	
}
