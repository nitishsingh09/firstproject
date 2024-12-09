package accMod1;

import accMod.A;
import accMod.N;

public class A1 {
	public void hello() {
		System.out.println("A1");
	}
	
	protected A1() {
		super();
		System.out.println(4000);
	}
	
	
	
	public static void main(String[] args) {
		
		A n = new A();
		System.out.println(n.x);
	
		N ns = new N();
		System.out.println(ns.i);
		n.test();
		
	}

}
