package numbers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Occurence {
	
	public static void main(String[] args) {	
		
//		int m = 5;
		
		int a[] = {2,2,2,5,5,3,8,8,9,9,9,9,9};
		
		int n = a.length;
		
		Map<Integer,Integer> mp = new HashMap<>();
		
		for (int i = 0; i<n; i++) {

			if(mp.containsKey(a[i])){
				
				mp.put(a[i],mp.get(a[i]) + 1);
				
				
			}else {
				
				mp.put(a[i],1);
			}
			
		}
		System.out.println(mp);
		System.out.println(mp.values());
		System.out.println(mp.keySet());
		
		
		
		
		System.out.println("-------------------------------");
		
		String name = "nnnnnnnaaaaaaaahhhdhdy"; 
		
		Map<Character,Integer> mp1 = new HashMap<>();
		
		char[] str = name.toCharArray() ;     
		
		for(char c : str) {
			
			if (mp1.containsKey(c)) {
				
				mp1.put(c, mp1.get(c)+1);
				
			}
			else {
				
				mp1.put(c, 1);
				
			}
			
		}
//		System.out.println(mp1);
//		
//		System.out.println(mp1.keySet());
//		
//		System.out.println(mp1.values());
		
		
		
//		System.out.println(mp);
//		int sum = 0;
//		for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//			if(entry.getValue()<=m) {
//				sum += entry.getValue();
//				System.out.println(entry.getKey()+ " "+ entry.getValue());
//			}
//		}
//		System.out.println("answer is "+sum);
	}

}
