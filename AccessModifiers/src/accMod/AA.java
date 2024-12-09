package accMod;


public class AA extends A{

	protected int i =90;
	
	public void test() {
		System.out.println(11);
	}
	
	public static void main(String[] args) {
		AA a1 = new AA();
		System.out.println(a1.y);
		
		
		N n = new N();
		System.out.println(n.i);
	}
}
