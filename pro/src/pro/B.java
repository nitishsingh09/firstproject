package pro;

public class B extends A {
	
	private B(){
		System.out.println(2);
	}
	
	public static void main(String[] args) {
//		B b1 = new B();
//		b1.test();
		A.hello();
	}
	
	public void test() {
		System.out.println(super.j);
		super.ff();
		System.out.println("test");
		
	}
	
	static int hello(){
		System.out.println(12);
		return 10;
	}
	

}

