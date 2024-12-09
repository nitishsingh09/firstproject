package classUpCasting;

import java.util.HashSet;

public class C {
	
	public static void main(String[] args) {
		
		String s ="sjshhdydhj";
		
		 HashSet<Character> hs = new HashSet<>();
		 
		 for(int i=0; i<s.length()-1;i++) {
			 
			 hs.add(s.charAt(i));
		 }
		 
		 System.out.println(hs);
		
	}

}
