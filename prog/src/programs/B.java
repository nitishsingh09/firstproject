package programs;

public class B {
	public static void main(String[] args) throws Exception {
	try {
		System.out.println("a");
		throw new ArithmeticException();
	}catch(ArithmeticException e) {
		try {
			try {
				throw new Exception();
			}catch(Exception es) {
				System.out.println("b");
			}
		throw new Exception();
		}catch (Exception ex){
			System.out.println("c");
		}finally {
			System.out.println("d");
		}
	}
	catch (NullPointerException p) {
		System.out.println(500);
		
	}catch(Exception s) {
		System.out.println("exception handled");
	}
	finally{
		System.out.println("E");
		
	}
	System.out.println(1);
	}

}
