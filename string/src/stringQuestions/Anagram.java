package stringQuestions;

public class Anagram {
	public static void main(String[] args) {
		
		if(anagram("sdgg","sddgg")) {
			System.out.println("this is anagram");
		}else {
			System.out.println("this is not anagram");
			
		}
		
	}
	
	
	public static boolean anagram(String s1,String s2) {
		
		int count[] = new int[256];
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		
		for(int i=0; i<=s1.length()-1;i++) {
			count[s1.charAt(i)]++;			
			count[s2.charAt(i)]--;
		}
		
		for(int i=0; i<count.length;i++) {
			if(count[i]!=0) {
				return false;
			}
		}
		return true;
		
	}
}
