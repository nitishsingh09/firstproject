package compare;

import java.util.ArrayList;

import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {
		
		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp("nitish",4545454,122));
		emps.add(new Emp("ankit",499799,550));
		emps.add(new Emp("anil",12212,450));
		System.out.println(emps);
		
		Collections.sort(emps);
		System.out.println(" ");
//		compare objects using comparable interface
		System.out.println(emps);
		
	}
}
