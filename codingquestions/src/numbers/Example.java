package numbers;

public class Example {
	
	public static void main(String[] args) {
		Demo<Integer> iobj = new Demo<Integer> (15);
		System.out.println(iobj.returnObj());
		Demo<String> sobj = new Demo<String>("hello world");
		System.out.println(sobj.returnObj());
	}
	
}


class Demo<T>{
	T obj;
	Demo (T obj){
		this.obj=obj;
	}
	public  T returnObj() {
		return this.obj;
	}	
}