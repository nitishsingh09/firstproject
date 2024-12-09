package multithreding;

public class B extends Thread {
	
	String name;
	B(String name){
		this.name = name;
	}
	public void run() {
		for(int i = 0; i< 10; i++) {
			System.out.println(this.name);
		}
	}
	
	public static void main(String[] args) {
		B b1 = new B("bbb");
		B b2 = new B("ccc");
		B b3 = new B("ddd");
		
		b1.start();
		b2.start();
		b3.start();
		
		
	}
	
}

