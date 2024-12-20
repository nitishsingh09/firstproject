package filter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class IntermediateOperation {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();

		stringList.add("one");
	    stringList.add("two");
	    stringList.add("three");
	    stringList.add("only");
	    
	    //limit method
		Stream<String> stream = stringList.stream();
//
//        stream.skip(3).limit(1)
//                .forEach(System.out::println );
		
		
		
		//peek method
		stream.filter(e -> e.startsWith("o"))
        .peek(e -> System.out.println("Filtered value: " + e))
        .map(String::toUpperCase)
        .peek(e->System.out.println(e))
        .map(String::toLowerCase)
        .peek(e -> System.out.println("Mapped value: " + e))
        .collect(Collectors.toList());

	}
}
