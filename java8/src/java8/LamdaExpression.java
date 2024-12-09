package java8;

public class LamdaExpression {

	
	
	public static void main(String[] args) {
		
		Functional c = (a,b) -> {
			return a+b;
		};
		int s =c.t(10,20);
		System.out.println(s);
		
	}
	
}
