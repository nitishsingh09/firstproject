package filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
	 
	
	public static Stream<String> streamOf(List<String> list) {
	    return  list.isEmpty() ?  Stream.empty() : list.stream();
	}
	
	
	public static void main(String[] args) {
		
		
		List<String> l = new ArrayList<>();
		
		l.add("nihshhsh");
		l.add("kkskshkhs");
		l.add("llskhskh");
		l.add("ddkhdkhodlih");
		l.add("desdkugdkdi");
		
		
//		List<String> collect2 = l.stream().peek(e->System.out.println("v - "+ e)).skip(2).map(e->e.toUpperCase()).limit(2).peek(e->System.out.println("value - "+ e)).collect(Collectors.toList());
		
//		
//		long count = l.stream().skip(1)
//		  .map(element -> element.substring(0, 3)).sorted().count();
//		System.out.println(count);
		
//		List<String> collect = l.stream().skip(3).sorted()
//		  .map(element -> element.substring(0, 3)).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		Stream<String> streamGenerated =
//				  Stream.generate(() -> "element").limit(10);
////		
//		System.out.println(streamGenerated.collect(Collectors.toList()));
		
		Stream<String> onceModifiedStream =
				  Stream.of("abcd", "bbcd", "cbcd").skip(1);
		System.out.println(onceModifiedStream.collect(Collectors.toList()));
		
//		int reducedParams = Stream.of(1, 2, 3)
//				  .reduce(10, (a, b) -> a + b, (a, b) -> {
//				    System.out.print("combiner was called");
//				     return a + b;
//				  });
//		System.out.println(reducedParams);
 	}

}
