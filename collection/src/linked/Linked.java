package linked;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

public class Linked {
	
	public static void main(String[] args) {
		
//		List<Integer> l = new LinkedList<>(Arrays.asList(1011,20,50,84,621)); 
//		
//		int[] a = {1,2,3,4,5,6};
////		System.out.println(a[a.length-2]);
//		
//		
//		ListIterator<Integer> it = l.listIterator(l.size());
//		while(it.hasPrevious()){
//			System.out.println(it.previous());	
//		}	
		
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1,"nnn");
		hm.put(2,"n");
		hm.put(3,"ddn");
		hm.put(4,"ppn");
		hm.forEach((x,y)-> System.out.println(x+"-"+y));
//		System.out.println(hm.get(1));
//		System.out.println(hm.entrySet());
//		System.out.println(hm.keySet());
		System.out.println(hm.values());
	}

}
