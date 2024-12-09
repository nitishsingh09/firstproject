package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenAndOdd {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(17);
		list.add(14);
		list.add(13);
		list.add(54);
		list.add(22);
		list.add(10);
		list.add(17);
		list.add(13);
		
//		System.out.println("bigger than 20");
//		List<Integer> list5 = list.stream().filter(x->x>20).collect(Collectors.toList());
//		System.out.println(list5);
//		List<Integer> l2 = list.stream().filter(x->x%2==1).collect(Collectors.toList());
//		System.out.println(l2);
//		System.out.println("square of numers");
//		List<Integer> square = list.stream().map(x->x*x).collect(Collectors.toList());
//		System.out.println(square);
//		
//		System.out.println("EVEN NUMBERS");
//		List<Integer> list2 = list.stream().filter(x->x%2==0).collect(Collectors.toList());
//		System.out.println(list2);
//		
//		
//		System.out.println("ODD NUMBERS");
//		List<Integer> list3 = list.stream().filter(x->x%2==1).collect(Collectors.toList());
//		System.out.println(list3);
//		
//		
//		System.out.println("UNIQUE NUMBER");
//		List<Integer> list4 = list.stream().distinct().collect(Collectors.toList());
//		System.out.println(list4);
//		
//		list.remove(2);
		
		System.out.println("beginning start with b");
		List<String> str = Arrays.asList("bbbb","jshs","bhsgs","jjjj","jjjj");
		List<String> str1 = str.stream().filter(s -> s.startsWith("b")).collect(Collectors.toList());
		System.out.println(str1);
		
//		System.out.println("ends with same letter");
//		List<String> str2 = str.stream().filter(s -> s.endsWith("s")).collect(Collectors.toList());
//		System.out.println(str2);
//		
//		
//		System.out.println("count the number of word (jjjj) repeat in an array");
//		List<String> str3 = str.stream().filter(s->s.equals("jjjj")).collect(Collectors.toList());
//		System.out.println(str3.size());
	}

}
