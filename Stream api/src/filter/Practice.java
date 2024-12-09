package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
	
	public static void main(String[] args) {
		
		List<Product> p= new ArrayList<>();
		p.add(new Product(1,"cpple",1000));
		p.add(new Product(1,"bppssssle",1000));
		p.add(new Product(2,"mango",500));
		p.add(new Product(2,"mango",500));
		p.add(new Product(2,"mango",500));
		p.add(new Product(3,"guava",100));
		p.add(new Product(4,"lichi",100));
		p.add(new Product(5,"chiku",200));
		p.add(new Product(6,"pineapple",101));
		p.add(new Product(7,"pineapple",101));
		p.add(new Product(8,"pineapple",101));
		
		
//		String listToString = p.stream().limit(2).skip(1).map(Product::getName).sorted().collect(Collectors.joining(", ", "[", "]"));
//		System.out.println(listToString);
	
//		String z = p.stream().map(x->x.getName()).sorted().collect(Collectors.toList()).stream().collect(Collectors.joining(","));
//		
//		
//		List<String> it = p.stream().map(x->x.getName()).sorted().collect(Collectors.toList());
//		String listString = it.stream().collect(Collectors.joining(", ","[","]"));
//		System.out.println(listString);
		
//		List<Integer> it = p.stream().filter(x->x.getPrice()>100).map(x->x.getPrice()).sorted().collect(Collectors.toList());
//		System.out.println(it);
//		List<String> pp = p.stream().map(x->x.getName().toUpperCase()).filter(x->x.startsWith("L")).collect(Collectors.toList());
//		System.out.println(pp);		
		
		
//		p.stream().skip(5).limit(5).forEach(System.out::println);
//		List<String> zz = z.stream().skip(2).limit(1).collect(Collectors.toList());
//		System.out.println(a);
//		System.out.println(z);
		
//		Set<Integer> collect = p.stream().filter(p1 -> p1.getPrice() > 100).map(p1->p1.getPrice()).collect(Collectors.toSet());
//		collect.forEach(System.out::println);
		
		
//		Map<Integer,Long> collect1 =p.stream().collect(Collectors.groupingBy(Product::getPrice,Collectors.counting()));
//		System.out.println(collect1);
		
		Map<String,List<Product>> lp = p.stream().collect(Collectors.groupingBy(Product::getName));
		System.out.println(lp);
//		
		
		
//		Optional<Product> p1 =p.stream().max(Comparator.comparing(Product::getPrice));
//		if(p1.isPresent()) {
//			Product pro = p1.get();
//			System.out.println(pro.getName()+" - "+ pro.getPrice());
//		}
		
//		Optional<Product> p2 = p.stream().min(Comparator.comparing(Product::getPrice));
//		if(p2.isPresent()) {
//			System.out.println(p2.get().getPrice());
//		}

//		p.stream().filter(pro -> "mango".equals(pro.getName())).forEach(System.out::println);
//		p.stream().filter(product -> product.getName().equals("pineapple")).forEach(product -> System.out.println(product.getName()));
		
//		Set<String> str = p.stream().map(a -> a.getName()).collect(Collectors.toSet());
//		str.forEach(System.out::println);
		
		
//		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
////		
//		Optional<Integer> ss =l.stream().max((val1,val2) -> {
//			return val1.compareTo(val2);
//		});
//		System.out.println(ss.get());
//		

	}

}
