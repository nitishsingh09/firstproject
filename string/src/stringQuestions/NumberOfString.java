package stringQuestions;

import java.util.Scanner;

public class NumberOfString {

	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("ENTER THE SENTENCE");
//		String str = s.nextLine();
		String str = "    nbnb n bnv vgf      ";
		String str1 = str.trim();

		int count = 0;
		
//		
		
		
		
		
		
		if(str1.charAt(0)!=' '){
			count++;
		}
		
		System.out.println(count);
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)==' ' && str1.charAt(i+1)!=' ') {
				count++;
			}
		}
		
		System.out.println("total words : "+count);
		
		
		
	}


}
