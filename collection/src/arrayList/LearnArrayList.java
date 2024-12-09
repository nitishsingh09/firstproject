package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		
		List<Integer> a = new ArrayList<>();
		a.add(500);
		a.add(600);
		a.add(555);
		
		ArrayList<Integer> b = new ArrayList<>();
		
		list.addAll(a);
		System.out.println(list);
		
		System.out.println(list.get(2));  // get value by index no.
		list.remove(2);
		System.out.println(list);
		
		list.remove(Integer.valueOf(40));
		System.out.println(list);
		
		list.set(0, 5000);
		System.out.println(list);
		System.out.println(list.contains(5000));
		
		System.out.println(list.indexOf(5000));
		
		System.out.println(list.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(list.size());
		
		if(list.contains(10)) {
		list.remove(Integer.valueOf(10));
		}else {
			System.out.println("not contain");
		}
		list.set(2,0);
		System.out.println(list);
		System.out.println("__________");
		System.out.println(list.contains(0));
		
		System.out.println(a.contains(555));
		b.trimToSize();
		System.out.println(b.size());
		
		System.out.println(list.indexOf(0));
		if(list.contains(list.indexOf(0))) {
			System.out.println(list.indexOf(0));
		}else {
			System.out.println("not contain");
		}
		
		list.removeAll(a);
		System.out.println(list);
		
		ArrayList<Integer> d = new ArrayList<Integer>(20);
		System.out.println(d);
		System.out.println(d.size());
		
		ArrayList<Integer> list1 = new ArrayList<>(list);
		System.out.println(list1);
		
		list1.add(20);

		System.out.println(list1);
		System.out.println(list1.lastIndexOf(20));
//		System.out.println("---------------------------------------- ");
//		System.out.println("by using for each loop");
//		for(Integer i : list) {
//			System.out.println(i);
//		}
//		 
//		System.out.println("----------------------------------------");
//		System.out.println("by using iterator");
//		Iterator<Integer> it = list.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}
	
	
 
}
