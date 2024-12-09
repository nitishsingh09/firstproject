package accMod1;

public class A2 extends A1 {
	public  void hello() {
		System.out.println("A2");
	}
	
	public static void main(String[] args) {
		A1 a = new A1();
		a.hello();
		
		A1 a2 = new A2();
		a2.hello();
		
		A2 a3 = new A2();
		a3.hello();
	}
}
