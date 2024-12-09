package enc;

public class A {
	private int a ;
	private String name ;
	
	public void setA(int a){
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.setA(10);
		System.out.println(a1.getA());
		
		a1.setName("nitish singh");
		System.out.println(a1.getName());
	}
}