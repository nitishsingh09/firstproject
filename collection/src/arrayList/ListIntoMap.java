package arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIntoMap {
	public static void main(String[] args)
    {
  
        // create a list
        List<Student>
            lt = new ArrayList<Student>();
  
        // add the member of list
        lt.add(new Student(1, "Geeks"));
        lt.add(new Student(2, "For"));
        lt.add(new Student(3, "Geeks"));
        
        System.out.println("list : "+ lt);
  
        // create map with the help of
        // Object (stu) method
        // create object of Map class
        Map<Integer, String> map = new HashMap<>();
  
        // put every value list to Map
        for (Student stu : lt) {
            map.put(stu.getId(), stu.getName());
        }
  
        // print map
        System.out.println("Map  : " + map);
        
        
        // convert list into map by collections toMap method
        LinkedHashMap<Integer, String>
        map1 = lt.stream().collect(Collectors.toMap(Student::getId,Student::getName,(x, y)-> x + ", " + y,LinkedHashMap::new));

	    // print map
//	    map1.forEach(
//	        (x, y) -> System.out.println(x + "=" + y));
        System.out.println("map : "+map1);
    	}
}


