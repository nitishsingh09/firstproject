package a;

public class C implements P{
	int y=10;
	void test() {
		System.out.println("ashish");
	}
	public void hello() {
		System.out.println("hello");
	}
	
	static void h() {
		System.out.println("hhhhh");
	}
	
	public static void main(String[] args) {
		System.out.println(P.x);
		P.h();
		C c = new C();
		c.hello();
		
	}

}
