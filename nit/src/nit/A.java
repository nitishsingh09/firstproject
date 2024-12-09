package nit;



public class A {
	public static void main(String[] args) {
		A c1 = new A();
		c1.test(10,20,30);
	}
	public void test(int...i) {
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
	}
}
