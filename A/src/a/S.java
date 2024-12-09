package a;

public class S extends C {
	int x = 20;
	@Override
	void test() {
	System.out.println("nnnnn");
	}
public static void main(String[] args) {
	C s1 = new S();
	System.out.println(s1.x);
	s1.test();
}

}
