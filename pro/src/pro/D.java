package pro;

public class D {
	
	D(){
		System.out.println(100);
		System.out.println("non");
		
	}
	
	D(int i){
		this();
		System.out.println(i);
		System.out.println("ooo");
	}
	public void test() {
		System.out.println('a');
	}
	
	static {
//		new D(10000);
		System.out.println("NINI");
		
	}
	{
		this.test();
		System.out.println(true);
	}
	{
		System.out.println("hello");
		
	}
	public static void main(String[] args) {
		new D();
	}
}
