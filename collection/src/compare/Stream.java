package compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		
		ArrayList<Emp> emps = new ArrayList<>();
		emps.add(new Emp("nitish",454,122));
		emps.add(new Emp("ankit",499799,550));
		emps.add(new Emp("anil",12212,450));
		emps.add(new Emp("anil",1221288888,450));
		emps.add(new Emp("anil",12212,450));
		emps.add(new Emp("nitish",111,1));
		emps.add(new Emp("ankit",499799,550));
		emps.add(new Emp("ankit",499799,550));
		
		
		List<Emp> l = emps.stream().filter(e->e.getName().equals("nitish")&& e.getPhone()==111).collect(Collectors.toList());
		System.out.println(l.size());
		List<Emp> collect3 = emps.stream().filter(e -> e.getName().equals("nitish") && e.getEmpId()==1).collect(Collectors.toList()); 
//		System.out.println(collect3);
		Optional<Emp> collect = emps.stream().collect(Collectors.maxBy(Comparator.comparing(Emp::getPhone)));
		if(collect.isPresent()) {
//			System.out.println(collect.get());
		} 
		
		
		
		Map<String, Long> collect2 = emps.stream().collect(Collectors.groupingBy(Emp::getName,Collectors.counting()));

//		System.out.println(collect2);
		
		List<String> emp = Arrays.asList("n","","nn","","","ns","nss","nskk");
		Set<String> s = new LinkedHashSet<>(emp);
//		System.out.println(s);
		 long cnt= emp.stream().filter(e-> e.length()>2).count();
//		System.out.println("count :" + cnt );
//		
//		System.out.println(l);
		
		
	}
}
