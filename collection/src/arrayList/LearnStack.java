package arrayList;

import java.util.Stack;

public class LearnStack {
	public static void main(String[] args) {
		Stack<String> str =new Stack<>();
		
		str.push("nitish");
		str.push("amit");
		str.push("k");
		str.push("sk");
		str.push("sunita");
		str.push("aanvi");
		System.out.println(str);
		int x =str.size();
		System.out.println("--------------------------------------");
		System.out.println(str.peek());
		
		System.out.println("--------------------------------------");
		for(int i=0;i<x;i++)  {
			str.pop();
		}
		
		System.out.println(str);
		
	}
}
