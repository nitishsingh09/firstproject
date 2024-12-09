package filter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	
	public static void main(String[] args) {
		
		List<Product> p = new ArrayList<>();
		p.add(new Product(1,"apple",1000));
		p.add(new Product(10,"apple",1000));
		p.add(new Product(2,"mango",1000));
		p.add(new Product(3,"guava",100));
		p.add(new Product(4,"lichi",100));
		p.add(new Product(5,"chiku",2000));
		p.add(new Product(6,"pineapple",2000));

	    // add the member of list
		
	    // create map with the help of
	    // Collectors.toMap() method
	    Map<Integer, String> map =
	    		p.stream().collect(Collectors.toMap( Product::getId, Product::getName,(x, y) ->x+" "+y, LinkedHashMap::new));
	    
	    System.out.println(map);
	    Map<Integer, List<Product>> collect = p.stream().collect(Collectors.groupingBy(Product::getPrice));
	    System.out.println(collect);
//	    collect.forEach((x,y)->System.out::println(x+" "+y));
	    System.out.println(collect);
	    // print map
//	    map1.forEach(
//	          (x,y)->  System.out.println(x+" = "+y));
//	   
//	    System.out.println(map);
	      
	    
	}

}
