package stringQuestions;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String  str = "nitish singh maurya";
		
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==' ') {
				continue;
			}
			System.out.print(str.charAt(i));
		}
		
	}

}
