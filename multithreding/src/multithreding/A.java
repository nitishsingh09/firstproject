package multithreding;

public class A extends Thread{
	
	
	public void run() {
		
		for(int i=0; i<1000; i++) {
			System.out.println("run");
		}
	}

	public static void main(String[] args) {
		A t1 = new A();
		t1.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("main");
		}
	}
	
}
