package collect;

import java.util.List;
import java.util.Stack;

public class Stack1 {
	
	public static void main(String[] args) {
		
//		Stack<Integer> l = new Stack<Integer>();
//		l.push(4444);
//		l.push(55);
//		l.push(11);
//		System.out.println(l);
//		
//		System.out.println(l.peek());
//		
//		System.out.println(l.pop());
//		System.out.println(l);
//		System.out.println(l.empty());
		
		
		String str = "{{}}}";
		int cnt1 = 0;
		int cnt2 = 0;
		
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)=='{') {
				cnt1++;
			}else if(str.charAt(i)=='}') {
				cnt2++;
			}
		}
		if(cnt1==cnt2) {
			System.out.println("this is valid ");
		}else {
		System.out.println("this is not valid");
		}
	}
	

}
