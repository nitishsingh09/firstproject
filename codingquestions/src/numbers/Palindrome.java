package numbers;

public class Palindrome {

	 public static void main(String args[]){  
	  
//		  int n=45454;//It is the number variable to be checked for palindrome  
//		  int sum=0;
//		  int temp=n; 
//		  
//		  while(n>0){    
//		   int rem=n%10;  //getting remainder  
//		   sum=(sum*10)+rem;    
//		   n=n/10;    
//		  }    
//		  
//		  if(temp==sum)    
//		   System.out.println("palindrome number ");    
//		  else    
//		   System.out.println("not palindrome");  
		 
		 boolean b = checkPalindromeString("nitinj");
		 System.out.println(b);
		}  
	 
		 
	static boolean checkPalindromeString(String input) {
			boolean result = true;
			int length = input.length();

			for (int i = 0; i < length/2; i++) {
				if (input.charAt(i) != input.charAt(length - i - 1)) {
					result = false;
					break;
				}
			}

			return result;
		}

	 
}
