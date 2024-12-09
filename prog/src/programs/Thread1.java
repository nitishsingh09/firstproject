package programs;



public class Thread1 extends Thread{
	String name;
	Thread1(String name){
		
		this.name = name;
	
	}
	@Override
	public void run() {
		for(int i =0; i<=10; i++) {
			System.out.println(this.name);
		}		
	}
	
	public static void main(String[] args) {
		Thread1 t = new Thread1("nitish");
		Thread t1 = new Thread(t);
		t1.start();
		
		Thread1 a = new Thread1("amit");
		Thread t2 = new Thread(a);
		t2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("hello");
		}
		
	}
	

}
