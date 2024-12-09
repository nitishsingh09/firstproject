package numbers;

public class Ex extends Foo {
	
	public static void main(String[] args) {
		
		String str = "c ABC 123 abc";

		// Remove a character from a string in Java
		System.out.println("String after removing all the 'a's = "+str.replace("a", ""));

		// Remove spaces from a string in Java
		System.out.println("String after removing all the spaces = "+str.replace(" ", ""));

		// Remove a substring from a string in Java	
		System.out.println("String after removing the first 'ab' substring = "+str.replaceFirst("ab", ""));

		// Remove all the lowercase letters from a string in Java
		System.out.println("String after removing all the lowercase letters = "+str.replaceAll("([a-z])", ""));

		// Remove the last character from a string in Java
		System.out.println("String after removing the last character = "+str.substring(5, str.length()));
	}
	
	
}



class Foo{
	Foo(){
		System.out.println("foo");
	}
}