package inher;

public class I extends J {
	
	

	public static void main(String[] args) {
		I b1 = new I();
		
		

		System.out.println(b1.x);
		b1.greetings();
		b1.name();
		System.out.println(b1.a);
		System.out.println(K.s); //STATIC VARIABLES CALL IN STATIC WAY
		
	}

}
