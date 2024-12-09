package collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Llist {
	
	public static void main(String[] args) {
		
		
		
		List<Student> s = new ArrayList<>();
		s.add(new Student(1,"nitish",8));
		s.add(new Student(2,"ram",2));
		s.add(new Student(3,"harsh",5));
		s.add(new Student(4,"anil",2));
		
		List<Student> s1 =s.stream().filter(x->x.getMarks()>4).collect(Collectors.toList());
		System.out.println(s1);
		s1.forEach(e->System.out.println(e.getName()+" passed"));
		
//		  LinkedHashMap<Integer, String> map = s1.stream().collect(Collectors
//                  .toMap( Student::getId, Student::getName,(x, y) -> x+ ", "+ y, LinkedHashMap::new));	
//		 
//		
//		System.out.println(map);
	}

}
