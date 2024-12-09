package collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(16);
		a.add(17);
		a.add(18);
		a.add(10);
		a.add(15);
		
		
		
		System.out.println(a);
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(45545);
		a1.addAll(a);
//		System.out.println(a1);
//		System.out.println(a.get(5));
//		System.out.println(a.isEmpty());
		
//		System.out.println(a.contains(10));
//		System.out.println(a.indexOf(10));
//		a.remove(Integer.valueOf(10));
//		a.remove(Integer.valueOf(10));
//		a.removeAll(a);
//		a.set(0,5);
//		System.out.println(a.size());
		
//		a.trimToSize();
		
//		System.out.println(a);
		
		
		List<Integer> list = a.stream().filter(s->s%2==0).collect(Collectors.toList());
//		System.out.println(list);
		
		List<Integer> collect = a.stream().map(i->i*i).collect(Collectors.toList());
//		System.out.println(collect);
		
		List<Integer> c2 = a.stream().filter(i->i==10).collect(Collectors.toList());	
//		System.out.println(c2.size());
		
		Set<Integer> s1 = new HashSet<>(a);
//		System.out.println(s1);
		
		ListIterator<Integer> ls = a.listIterator(a.size());
		while(ls.hasPrevious()) {
			System.out.print(ls.previous()+" ");
		}
		
		
		
	}

}
