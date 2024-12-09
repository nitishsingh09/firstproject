package accMod;

public class N {
	public N() {
		System.out.println("private constructor");
	}
	
	public int i =100;
	public static void main(String[] args) {
		N n = new N();
		System.out.println(n.i);
	}
	
}
