package java8;

public class MethodRefrence {
	public static int test(int x,int y) {
		return x+y;
	}
	public static void main(String[] args) {
		
		Functional f1 = MethodRefrence :: test;
		int f=f1.t(45,5);
		System.out.println(f);
	}
}
