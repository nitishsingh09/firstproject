package java8;

public class A implements Static{
	@Override
	public void test() {
		System.out.println("static in");
	}
	
	
	public static void main(String[] args) {
		A a = new A();
		a.test();
		Static.t();
	}
	

}
