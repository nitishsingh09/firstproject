package compare;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(55);
		marks.add(12);
		marks.add(450);
		System.out.println(marks);
		Collections.sort(marks);
		System.out.println(marks);
	}
}
