package a;

public interface A {
	int x =10;
	default void t() {
		System.out.println("t1");
	}
	static void t2() {
		System.out.println("t2");
	}

	 public static void main(String[] args) {
		
		System.out.println(x);
		
	}
}
