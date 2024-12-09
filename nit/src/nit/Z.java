package nit;

public class Z {
	
	public static void main(String[] args) {
		
//		Z.test(10,20,30);
		Z z1 = new Z();
		

		
		
	}
	
	public  static void test(int...i) {
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		
	}
	
	public int add (int a, int b) {
		return a+b;
	}
}
