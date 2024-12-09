package numbers;

public class Example1 {
	public static void main(String[] args) {
	String name1 ="nitish";
	String name2 = new String("nitish");
	System.out.println(name1==name2);
	String name3= name2.intern();
	System.out.println(name1==name3);
	
	}
}
