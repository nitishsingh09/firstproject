package numbers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RemoveSpace {
	
	static String removeWhiteSpaces(String input) {
		StringBuilder str = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				
				str.append(c);
			
			
		}
		
		return str.toString();
	}


	
	public static void main(String[] args) {
//		String s = removeWhiteSpaces("ndnd  dndnd");
//		System.out.println(s);
//		String pattern = "MM-dd-yyyy-hh-mm-ss";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//
//		String date = simpleDateFormat.format(new Date());
//		System.out.println(date); 
		
//		String  s = "java";
//		String s1 = s;
//		System.out.println(s==s1);
//		 s = "kkkk";
//		System.out.println(s==s1);
//		System.out.println(s1);
		
//		String x = "aSSSbsdefc";
//		String y = "abcde";
//
//		String z =y.concat(x);

//		System.out.print(z);
//		
//			String s1 = "abc";
//		    String s2 = new String("abc");
//		    String s3 = new String("foo");
//		    String s4 = s1.intern();
//		    String s5 = s2.intern();
		    
//		    System.out.println(s3 == s4);
//		    System.out.println(s1 == s5);

		
		
	}
}
