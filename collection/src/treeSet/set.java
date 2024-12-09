package treeSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class set {

	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>(Arrays.asList(1,2,3,6));
//		System.out.println(ts);
		
		
		//find the unique elements in the arraylist
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(null,null,null,10,10,10,20,30,20,50,50,30));
		LinkedHashSet<Integer> l1 = new LinkedHashSet<>(arr);
//		System.out.println(l1);
		
		HashSet<Integer> hs1 = new HashSet<>(arr);
		hs1.remove(null);
//		System.out.println(hs1);
		
		TreeSet<Integer> ts1 = new TreeSet<>(hs1);
//		System.out.println(ts1);

		HashSet<Integer> hs = new HashSet<>(arr);
//		System.out.println(hs);
		
		//linkedHashSet contains only unique elements as well as null values.
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(null);
		lhs.add(null);
		lhs.add(null);
		lhs.add(10);
		lhs.add(12);
		lhs.remove(10);
		lhs.add(11);
		lhs.add(45);
		lhs.add(17);
		lhs.add(20);
		lhs.add(14);
//		System.out.println(lhs.contains(17));
//		System.out.println(lhs);
		
		List<Integer> l2 = arr.stream().filter(x->x==null ).collect(Collectors.toList());
//		System.out.println(l2.size());
		lhs.remove(null);
		List<Integer> l3 = lhs.stream().filter(x->x%2==0).collect(Collectors.toList());
//		System.out.println(l3);
		
		
//		Integer[] n = {1,2,3};
//		ArrayList<Integer> aa = (ArrayList<Integer>) Arrays.asList(n);
//		
//		aa.add(100);
//		System.out.println(aa);
		
//		String[] geeks = {"Rahul", "Utkarsh",
//                "Shubham", "Neelam"};
		
// Conversion of array to ArrayList using Arrays.asList
		Integer[] numbers = new Integer[] { 1, 2, 3 };
		String[] str = new String[] {"nitish","jjjj"};
 		List<String> list = new ArrayList<>(Arrays.asList(str));
//		System.out.println(list);
		
		list.add("nnn");
//		System.out.println(list);
		
		
	}
}
