package pro;
public class A { 
	
	public A(){
		System.out.println(100);
	}
	static A a1;
	int j=5;
	static int x = 10;
	 int y = 20;
	public static void main (String [] args) {
		a1 = new A();
		int s = A.name(100);
		System.out.println(s);
	}
	
	public static int name(int i) {
		System.out.println("I am nitish singh");
		
		System.out.println(A.a1);
		return i;
		
	}
	public  void ff() {
		System.out.println(100);
	
		
	}
	
	static int hello(){
		System.out.println(11);
		return 10;
	}

}
