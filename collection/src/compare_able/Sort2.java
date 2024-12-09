package compare_able;

import java.util.ArrayList;
import java.util.Collections;



public class Sort2 {
	
	public static void main(String[] args) {
		
		
		ArrayList<Emp2> emps = new ArrayList<>();
		emps.add(new Emp2("nitish","78455",10));
		emps.add(new Emp2("vishal","562341",52));
		emps.add(new Emp2("abhay","232323",15));
	
		System.out.println(emps);
		System.out.println(" ");
		Collections.sort(emps,new IdComparator());
	
		System.out.println(emps);
		System.out.println(" ");
		Collections.sort(emps,new NameComparator());
		System.out.println(emps);
	}
	
	
}
