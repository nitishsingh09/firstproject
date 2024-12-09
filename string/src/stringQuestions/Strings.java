package stringQuestions;

public class Strings {
	public static void main(String[] args) {
		String s = new String("nitish");
		String s1 = "nitish";
		String s2 = "nitish";
		if(s2==s1) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		System.out.println(s2.equals(s1));
		
		System.out.println(s==s1);
		
		System.out.println(s.equals(s2));
//		System.out.println("reverse string of nitish");
//		
//		for(int i=s1.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		
//		System.out.println("numbers of character in string");
//		System.out.println(s.length());
//		
//		System.out.println(s1.endsWith("h"));
//		System.out.println(s.startsWith("n"));
	}
}