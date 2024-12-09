package nit;



public class B {

	public static void main(String[] args) {
		
		B b1 = new B();
		System.out.println(b1);
		b1.test();
		
		B b2 = new B();
		System.out.println(b2);
		b2.test();
	}
	
	public void test() {
		System.out.println(this);
		this.test1();//shows warning but works because it auto corrected by compiler into B.test1
	
	}	
	public static void test1() {
		
		System.out.println(100);	
		
	}

}
