package nit;

public class D {
	byte a = 0;
	String b = "nitish";
	 float c = 10.5f;
	char d = 'n';
	
	public void test1() {
		System.out.println("good morning" +" "+ b);
		
	}
	
	public void test2() {
		System.out.println(c);
		System.out.println(a);
		float c = 15.5f;
		System.out.println(c);
		D d3 = new D();
		System.out.println(d3.c);
		System.out.println(d+a);
	}
	
	public static void main(String[] args) {
		D a2 = new D();
		a2.test1();
		a2.test2();
		
	}

}
