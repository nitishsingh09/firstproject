package nit;

public class E {
	E(){
		System.out.println(100);
	}
	E(E i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		E e1= new E();
		E e2 =new E(e1);
		new E(e2);
		
	}

}
