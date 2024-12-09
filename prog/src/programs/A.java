package programs;

public class A {

	public static void main(String[] args) {
		try {
			System.out.println("a");
			throw new ArithmeticException();
			
		}catch (NullPointerException e) {
			System.out.println("b");
			
		}catch(Exception e) {
			System.out.println("arith");
		}
		
		finally {
			System.out.println("c");
			try {
			int num=6/0;
			}catch(Exception e){
				System.out.println("f");
				
			}
			System.out.println("d");
			
		}
		
		System.out.println("e");
		
	
	}

}



