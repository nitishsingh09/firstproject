package nit;

public class C {
	
	public static void main(String[] args) {
		C c1 = new C();
		C v=c1.test1();
		System.out.println(v);
		int val = test();
		System.out.println(val);
		
	}
	public static int test() {
		System.out.println(100);
		return 100;
	}
	public C test1() {
		C c2 = new C();
		return c2;
	}
}
