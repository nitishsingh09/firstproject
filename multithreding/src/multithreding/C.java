package multithreding;

public class C implements Runnable {
	int balance =0;
	

	public static void main(String[] args) {
		C a1 = new C();
		a1.account();
		System.out.println(a1.balance);
		
	}
	
	
	
	public void account() {
		Thread t1 = new Thread(new C() {
			public void run() {
				add();
			}	
		});
		
		
		Thread t2 = new Thread(new C() {
			public void run() {
				sub();
			}
		});
		
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	public synchronized void add() {
		for(int i = 0; i<10000;i++) {
			balance = balance + i;
		}
	}
	private void sub() {
		for(int i = 0;i<10000;i++) {
			balance = balance + i;
		}
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	

}
