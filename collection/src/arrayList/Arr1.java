package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Arr1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(4,5,2,6,8,44,5,566,12,515,8,646);
		List<Integer> list = l.stream().filter(x-> x>20).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> list1 = l.stream().filter(x->x%2==0).collect(Collectors.toList());
//		System.out.println(list1);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(70);
		l3.add(60);
		l3.add(50);
		l3.add(40);
		l3.add(30);
		l3.add(20);
		l3.add(10);
		
		List<Integer> n=l3.stream().filter(x->x%2!=0).collect(Collectors.toList());
//		System.out.println(n);
		
		//if we want remove dublicate element from arraylist we put that list into hashset..  
		HashSet<Integer> s1 = new HashSet<>(l3);
//		System.out.println(s1);
		
		LinkedHashSet<Integer> s2 = new LinkedHashSet<>(l3);
		
//		System.out.println(s2);
		
		
//		Reverse the arraylist by using list iterator.
		
		
		ListIterator<Integer> ll = l.listIterator(l.size());
		while(ll.hasPrevious()) {
//			System.out.println(ll.previous());
			
		}
		
		
		
	}

}
