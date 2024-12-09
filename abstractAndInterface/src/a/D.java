package a;

public class D extends Abstract{
	static int y = 90;
	
	static void m() {
		System.out.println("static method");
	}

	@Override
	public void test() {

		
	}
	
	public static void main(String[] args) {
		D s = new D();
		System.out.println(s.x);
		System.out.println(m);
		System.out.println(y);
	}

}
