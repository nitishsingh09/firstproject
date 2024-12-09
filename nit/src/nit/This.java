package nit;

public class This {
	private int x;

	This(){
		System.out.println(1000);
	}
	
	This(int x){
		this();
	}
	
	This(int x, int y){
		this(x);
	}
	
	
	public static void main(String[] args) {
		
//		Person p1 = new Person(4,"boom");
		Person p2 = new Person(23,"Nitish");
		p2.walk();
//		p1.walk();
		This p3 = new This();
		p3.set(555);
		System.out.println(p3.get());
	}
	

	public  int get() {
		return x;
	}
	
	public void set(int x) {
		this.x=x;
		System.out.println(x);
		This.test1();
	}
	public static void test1() {
		System.out.println(100);
		This h = new This();
		h.tt();
		
	}
	public void tt() {
		System.out.println("hello");
	}

}
class Person{
	int age;
	String name;
	
	Person(){
		System.out.println("object is created");;
	}
	
	Person(int age, String name){
		this();
		this.age=age;
		this.name=name;
	}
	
	void walk() {
		System.out.println(name + " is walking");
		System.out.println("My age is" + " " + age);
	}
}
