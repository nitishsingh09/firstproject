package enc;

public class B {
	
	int age ;
	int hands;
	
	B(int x){
		this.age=x;
		System.out.println(age + " IS MY AGE");
	}
	B(int x, int y){
		this(5);
		this.age=x;
		this.hands=y;
		System.out.println("I HAVE "+ hands+ " and my age is" + age);

	}
	
	public static void main(String[] args) {
		
		
		B a1 = new B(23);
		B a2 = new B(23,2);
//		a1.setName("NITISH");
//		a1.setA(555);
//		System.out.println(a1.getName());
//		System.out.println(a1.getA());
//	}

	}

}
