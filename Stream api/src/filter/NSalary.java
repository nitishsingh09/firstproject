package filter;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NSalary {
	
	private static final Map<Integer, List<String>> Integer = null;

	public static void main(String[] args) {	
		Map<String,Integer> m = new HashMap<>();	
		m.put("amit", 10000);
		m.put("anil", 10000);
		m.put("nitish", 1500);
		m.put("abhay", 2000);
		m.put("chaman", 2500);	
		Map<Integer, List<String>> entry =mm(m,1);
		System.out.println(entry);
		
		Map<Product,Integer> newMap = new HashMap<>();
		newMap.put(new Product(1,"cpple",1000), 5);
		newMap.put(new Product(3,"bpple",3000), 12);
		newMap.put(new Product(4,"apple",4000), 7);
		newMap.put(new Product(6,"dpple",2000), 9);
		
//		newMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Product::getPrice))).
//		forEach(System.out::println);
			
	}
	public static Map.Entry<String, Integer> getNSalary(Map<String,Integer> map, int num){
		return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
				collect(Collectors.toList()).get(num-1);
	}
	public static Map<Integer,List<String>> mm (Map<String,Integer> map, int num){
		return  map.entrySet().stream()
				.collect(Collectors.groupingBy(Map.Entry::getValue,
				Collectors.mapping(Map.Entry::getKey,Collectors.toList())));
//				.entrySet().stream()
//				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
//				.get(num-1);
	}
}
