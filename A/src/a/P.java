package a;

public interface P {
	int x=10;

	 default void hello() {
		System.out.println("hello");
	}
	static void h() {
		System.out.println("hhXXXXXXXXhhh");
	}
}