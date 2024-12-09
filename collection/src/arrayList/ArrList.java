package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrList {

	
	public static void main(String[] args) {
		
		List<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(15);
		arr.add(5);
		arr.add(25);
		arr.add(4);
		arr.add(29);
		arr.add(35);
		arr.add(4);
		arr.add(25);
		arr.add(35);
//		System.out.println(arr.get(5));
//		System.out.println(arr.remove(5));
//		System.out.println(arr);
		
		List<Integer> newList  = arr.stream().filter(x->x>5).map(x->x+x).distinct().collect(Collectors.toList());
		System.out.println(newList);
//		 Collections.sort(newList);
		
		
//		System.out.println("Sorted Array"+newList);
		
		
//		Collections.reverse(newList);
		
		
//		System.out.println("List in descending order sort : "+newList);
		
//		arr.stream().distinct().forEach(System.out::println);
		
//		List<Integer> arrMethod = findElement(arr);
//		for (Integer i :arrMethod) {
//			System.out.println(i);
//		}
//		
//		
//		
//	}
//	public static List<Integer> findElement(List<Integer> arr){
//		
//		List<Integer> newArr = new ArrayList<Integer>();
//		
//		for(Integer i : arr) {
//			if(i>15) {
//				newArr.add(i);
//			}
//		}
//		return newArr;
//	}
//	
	}
}
