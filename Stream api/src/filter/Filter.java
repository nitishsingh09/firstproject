package filter;
import java.util.*;
import java.util.stream.*;

public class Filter {
	public static void main(String[] args) {
		
		
		List<Product> p1= new ArrayList<Product>();
		p1.add(new Product(1,"mango",100));
		p1.add(new Product(2,"banana",200));
		p1.add(new Product(2,"banana",200));
		p1.add(new Product(2,"banana",200));
		p1.add(new Product(3,"strawberry",50));
		p1.add(new Product(3,"strawberry",501));
		p1.add(new Product(5,"apple",666));
		p1.add(new Product(5,"apple",666));
		

//		p1.stream().filter(product -> product.getPrice() > 200 ).	
//			forEach(product -> System.out.println(product));
		
//		long c=p1.stream().filter(product -> product.getPrice() > 200 ).count();
//		System.out.println(c);
////	
//		Set<Integer> set = p1.stream().filter(product -> product.getPrice() > 500)
//				.map(product -> product.getPrice()).collect(Collectors.toSet());
//		
//
//		set.forEach(System.out::println);
		
		
//		Stream<Product> s1 = p1.stream();
//		s1.forEach( System.out::println);
		
		
		//max
//		Product pro =p1.stream().max((product1,product2) -> product1.getPrice() > product2.getPrice() ? -1 : 1).get();
//		System.out.println(pro.getName());
////		
//		List<Integer> collect = p1.stream().map(x->x.getPrice()).collect(Collectors.toList());
//		IntSummaryStatistics s = collect.stream().mapToInt(x->x).summaryStatistics();
//		System.out.println(s.getMax());
//		System.out.println(s.getMin());
//		System.out.println(s.getSum());
//		System.out.println(s.getAverage());
//		System.out.println(s.getCount());
		
		//min
//		Optional pro1 = p1.stream().max((product1,product2) -> product1.getPrice() < product2.getPrice() ? 1 : -1);
//		System.out.println(pro1.get());
//		
//		Optional<Product> min = p1.stream().min(Comparator.comparing(Product :: getPrice));
//		if(min.isPresent()) {
//			System.out.println(min.get().getPrice());
//		}
	
		Optional<Product> product = p1.stream().max(Comparator.comparing(Product :: getPrice));
		
		if(product.isPresent()) {
			System.out.println(product.get().getPrice());
			System.out.println(product.get());
		}
		
		
		Optional<Product> max = p1.stream().max(Comparator.comparing(Product :: getPrice));
		if(max.isPresent()) {
			Product product2 = max.get();
			System.out.println(product2.getId()+" "+product2.getName());
		}
//		Optional<Product> s1 =p1.stream().max(Comparator.comparing(Product :: getPrice));
//		
//		if(s1.isPresent()) {
//			
//			System.out.println(s1.get().getName());
//		}
//		
//		
//		Optional<Product> s2 =p1.stream().min(Comparator.comparing(Product :: getId));
//		if(s2.isPresent()) {
//			System.out.println(s2.get().getName());
//			System.out.println(s2.get());
//		}
		
		//create empty stream
//		Stream<Product> s= Stream.empty();
//		s.forEach(System.out::println);
		
		
		
		
		List<String> coll = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate","Hibernate");
//		List<String > col = coll.stream().filter(words -> "Hibernate".equals(words)).collect(Collectors.toList());
//		col.forEach(System.out::println);
		
		
//		coll.stream().filter(word -> "Hibernate".equals(word)).forEach(System.out::println);
//		long count = coll.stream().filter(word -> "Hibernate".equals(word)).count();
//		System.out.println(count);
		
//        Stream<String> stream2 = coll.stream();
//        stream2.forEach(System.out::println);
        
        Set<String> s = new HashSet(coll);
        System.out.println(s);

		
		
//        List<Integer> num = Arrays.asList(4, 2, 8, 9, 5, 6, 7);
//        num.forEach(System.out::println);
		
		
//        Stream<Integer> numgreater5 = num.stream().filter(x -> x > 5);
//        numgreater5.forEach(System.out::println);
//        numgreater5.forEach(System.out::println);// it will give exception
//        
    	List<Product> p= new ArrayList<Product>();
		p.add(new Product(1,"mango",100));
		p.add(new Product(2,"banana",200));
		p.add(new Product(2,"bobo",200));
		p.add(new Product(2,"berry",200));
		p.add(new Product(3,"strawberry",500));
		p.stream().distinct().map(x->x.getPrice()).forEach(System.out::println);
//		
//		List<Product> list = p.stream().filter(x->x.getPrice()>100 &&  x.getName().startsWith("b") ).collect(Collectors.toList());
//		List<Product> list2 = list.stream().filter(x-> x.getName().startsWith("b")).collect(Collectors.toList());
//		list.stream().forEach(e-> System.out.println(e.getName()));
//		System.out.println(list);
//		  Stream<String> streamOfArray = Stream.of("a", "b", "c");
//	        streamOfArray.forEach(System.out::println);
//		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//        myList.stream()
//              .map(s -> s + "") // Convert integer to String
//              .filter(s -> s.startsWith("1"))
//              .forEach(System.out::println);
        
        
       
	}

}
