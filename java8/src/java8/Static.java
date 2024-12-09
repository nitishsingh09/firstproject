package java8;

public interface Static {
	
	public default void test() {
		System.out.println("static");
	}
	
	static void t() {
		System.out.println("static method in interface");
	}
	
	public static void main(String[] args) {
		
	}
	

}
