package multithreding;

public class E {
	public static void main(String[] args) {
		D d1 = new D();
		d1.start();
		
		synchronized(d1) {
			try {
				d1.wait();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
		System.out.println(d1.total);
		
	}
}
