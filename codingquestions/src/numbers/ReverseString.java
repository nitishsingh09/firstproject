package numbers;

public class ReverseString {
	
	public static void main(String[] args) {
		
		
		String str = "hello";
		int n = str.length();
		for(int i=n-1; i>=0; i--)
			System.out.println(str.charAt(i));
		
		
//		System.out.println(str.startsWith("h"));
//		System.out.println(str.endsWith("p"));
//		System.out.println(str.toUpperCase());
//		System.out.println(str.length());
//		System.out.println(str.trim());
//		
		char[] i = {'a','b','c'};
		String s = String.valueOf(i);
		System.out.println(s);
		
		int[] b = {1,2,3};
		StringBuilder a =new StringBuilder();
		for (int j : b) {
			String valueOf = String.valueOf(j);
			a.append(valueOf);
		}
		System.out.println(a);
//		
//		String[] ss = {"nitish","singh","ahsj","shstttttttt"};
//		String d = String.valueOf(ss);
//		System.out.println(d);
		
		
		
		
	}

}
