package filter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TermianalOperation {
	
	public static void main(String[] args) {

		 List<String> stringList = new ArrayList<String>();
	        stringList.add("Guides");
	        stringList.add("JavPython");
		 	stringList.add("Guies");
		 	stringList.add("G");
		 	stringList.add("Guies");
		 	stringList.add("Java");
//		 	List<String> a = Arrays.asList("klm","efg","ghi","abc","bcd");
//		    List<String> b=a.stream().sorted().limit(2).collect(Collectors.toList());
//		    System.out.println(b);
		    
//		    List<Integer> bb = Arrays.asList(2,1,3,4,11,5,8);
//		    List<Integer> m =bb.stream().filter(x -> x%2==0).limit(2).collect(Collectors.toList());
//		    System.out.println(m);
//		    
//		    List<Integer> mm=bb.stream().sorted().filter(x -> x%2!=0).collect(Collectors.toList());
//		    System.out.println(mm);
////		    
//		    mm.stream().skip(mm.size()-2).limit(2).forEach(System.out::println);
		 	
		 	
//	        anyMatch method
		 	
//	        boolean s = stringList.stream().anyMatch(value->value.length()%2==0);
//	        System.out.println(s);
		 	
		 	
//	        boolean nn = stringList.stream().anyMatch(v->v.startsWith("java"));
//	        System.out.println(nn);
		 	
	        //allMatch method
//	        boolean b = stringList.stream().allMatch(values -> values.contains("G"));
//	       System.out.println(b);
	      
	       //noneMatch method
		   	
//	       boolean n = stringList.stream().noneMatch(value-> value.contains("Guides"));
//	       System.out.println(n);
//	        if(n) {
//	        	System.out.println("not present");
//	        }
//	        else
//	        	System.out.println("present");
	        
	        //collect method
	        List<String> str = new ArrayList<String>();
//
	       
	       
	        
	       
	        str.add("two");
	        str.add("three");
	        str.add("four");
	        str.add("five");
	        str.add("onknk");
	        str.add("one");
	       
	        


//	        Stream<String> stream = str.stream();
//	        List<String> stringsAsUppercaseList = stream
//	                .map(value -> value.toUpperCase())
//	                .collect(Collectors.toList());
//
//	        System.out.println(stringsAsUppercaseList);
//	        
//	        List<String> ls = str.stream().filter(v->v.length()>3).collect(Collectors.toList());
//	        ls.forEach(System.out::println);

	        
	        //findAny method
//	        Stream<String> stream1 = str.parallelStream();
//	        Optional<String> anyElement = stream1.filter(x->x.contains("on")).findAny();
//	        if(anyElement.isPresent()) {
//	        System.out.println(anyElement.get());
//	        }
	        //findFirst method 
//	        Stream<String> stream2 = stringList.stream();
//	        Optional<String> result = stream2.findFirst();
//	        System.out.println(result.get());
	        
	        //reduce method 
	        Optional<String> streams = stringList.stream().reduce((v1,v2) ->  v1+" "+v2);
	        String d =streams.get();
	        System.out.println(d);
	        
//	        Stream<String > stream4 = stringList.stream();
//	        Optional<String> reduced = stream4.reduce((l, m) -> {
//	            return l+m;
//	        });
//	        System.out.println(reduced.get());
	        
	        
	        //max method
//	        Optional<String> stream5 = stringList.stream().max((val1, val2) -> {
//	            return val1.compareTo(val2);
//	        });
//	        String maxString = stream5.get();
//	        System.out.println(maxString);
	        
	        //min method
	        
//	        Optional<String> stream6 = stringList.stream().min((val1, val2) -> {
//	            return val1.compareTo(val2);
//	        });
//	        String maxString2 = stream6.get();
//	        System.out.println(maxString2);
	        
	        //toArray method

//	        Stream<String> stream7 = stringList.stream();
//	        Object[] objects = stream7.toArray();
//	        System.out.println(objects[0]);
//	        System.out.println(objects[1]);
//	        System.out.println(objects[2]);
	        
	        
	        
//	        List<String> l = new ArrayList(Arrays.asList("one", "two"));
//	        Stream<String> sl = l.stream();
//	        l.add("three");
//	        String s = sl.collect(Collectors.joining(" "));
//	        System.out.println(s);
	        
	        
//	        List<String> values = Arrays.asList("Apple", "Banana", "Cherry", "Grapes", "Orange");
//
//	        Optional<String> anyFruit = values.stream()
//	                .filter(fruit -> fruit.contains("G"))
//	                .findAny();

//	        if (anyFruit.isPresent()) {
//	            System.out.println("Found a fruit containing 'G': " + anyFruit.get());
//	        } else {
//	            System.out.println("No fruit containing 'G' found.");
//	        }
	        
//	        List<String> myList = Arrays.asList("a", "b", "c", "d", "e");

	     // Parallel stream processing
//	        myList.parallelStream().forEach(System.out::println);
	}
}
