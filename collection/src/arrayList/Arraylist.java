package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.List;




public class Arraylist {

	
	public static void main(String[] args) {
	
	List<Integer> l = new ArrayList<>();
	int count =0;
	
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(40);
	l.add(10);
	
	for (Integer x: l) {
		if(x==10){
			count++;
		}
		
		
	}
//	System.out.println(count);
	
	List<Integer> c1 = l.stream().filter(x->x==10).collect(Collectors.toList());
//	System.out.println(c1.size());
	
	long count1 =l.stream().filter(x-> x>10).count();
	System.out.println(count1);
//	
//	System.out.println(l.get(1));
//	System.out.println(l.isEmpty());
//	System.out.println(l.contains(10));
//	System.out.println(l.indexOf(40));


//	Iterator i = l.iterator();
//	while(i.hasNext()) {
//		System.out.println(i.next());
//	}
//	ListIterator<Integer> itr = l.listIterator(l.size());
//	while(itr.hasPrevious()) {
//		System.out.println(itr.previous());		
//	}
	
	
	
//	System.out.println(l.size());
	}
}
