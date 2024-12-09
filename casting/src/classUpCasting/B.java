package classUpCasting;

public class B extends A{
	int x = 20;

	public void test1() {
		System.out.println(300);
	}
	public void test2() {
		System.out.println(400);
	}
	
	
	
	public static void main(String[] args) {
		
//		B b1 = new B();
//		b1.test();
//		b1.test1();
		
//		A a1 = new A();
//		System.out.println(a1.x);
//		a1.test();
//		a1.test1();
		
//		A a2 = new B();
//		a2.test();
//		a2.test1();
//		a2.test2();
//		
		B b2 = new B();
		b2.test();
		b2.test1();
		
		
		
	}
}
