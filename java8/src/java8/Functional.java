package java8;
@FunctionalInterface
interface Functional{
	public int t(int x,int y);
	
	default public void test() {
		System.out.println("test");	
	}
	
}
