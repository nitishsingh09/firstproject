package numbers;

import java.util.HashMap;
import java.util.Map;

public class Repetition {
	
	public static void main(String[] args) {		
		String arr = new String("nitish");		
		Map<Character,Integer> hm = new HashMap<>();	
		char[] str = arr.toCharArray();	
		for(char ch : str) {			
			if(hm.containsKey(ch)) {
				hm.put(ch,hm.get(ch)+1);
			}			
			else {
				hm.put(ch,1);
			}
		}
		System.out.println(hm);
		
		System.out.println("-------------------------------");			
		int[] a = {2,5,2,1,2,5,4,98,6,5,45};		
		int n = a.length;		
		Map<Integer,Integer> m = new HashMap<>();		
		for(int i=0;i<n-1;i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i],m.get(a[i])+1);
			}
			else {
				m.put(a[i],1);
			}
		} 		
		System.out.println(m);
		
		
		
		
		
		
	}
	
	

}
