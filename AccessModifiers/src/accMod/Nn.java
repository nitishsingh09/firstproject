package accMod;

public class Nn extends N{

	Nn(){
		System.out.println(11);
	}
	public void t() {
		System.out.println(super.i);
	}
	public static void main(String[] args) {
		
		Nn a = new Nn();
		a.t();
	}
}
