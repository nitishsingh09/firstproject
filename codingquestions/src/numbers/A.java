package numbers;

public class A {
	public static int i=10;
	public static void test() {
		System.out.println(100);
	}
}

class B extends A{
	public static void main(String[] args) {
		System.out.println(A.i);
		A.test();
	}
	
}

