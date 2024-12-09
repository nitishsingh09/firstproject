package stringQuestions;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "madam";
//		str=str.toLowerCase();
//		boolean  A = isPalindrome(str);
		
		String s = "";
		for (int i = str.length()-1; i >=0; i--) {
			s += str.charAt(i);
		}
		
		if(s.equals(str)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
//		System.out.println("Is this palindrome : "+A);
//		if(A==true) {
//			System.out.println("this is palindrome");
//		}else {
//			System.out.println("this is not palindrome");
//		}
		
	}

//	public static boolean isPalindrome(String str) {
//		String  reverseStr = "";
//		boolean ans = false;
//		for(int i=str.length()-1 ; i >=0 ; i--) {
//			reverseStr = reverseStr + str.charAt(i);
//		}
//		if(str.equals(reverseStr)){
//			ans = true;
//		}
//		return ans;
//	}
}
