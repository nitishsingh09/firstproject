package numbers;
import java.util.*;
public class StringNumberSorter {
	 public static void bubbleSort(List<String> stringNumbers) {
	        int n = stringNumbers.size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (compare(stringNumbers.get(j), stringNumbers.get(j + 1)) > 0) {
	                    // Swap stringNumbers[j] and stringNumbers[j + 1]
	                    String temp = stringNumbers.get(j);
	                    stringNumbers.set(j, stringNumbers.get(j + 1));
	                    stringNumbers.set(j + 1, temp);
	                }
	            }
	        }
	    }

	    private static int compare(String num1, String num2) {
	        int len1 = num1.length();
	        int len2 = num2.length();

	        if (len1 != len2) {
	            return len1 - len2;
	        }

	        return num1.compareTo(num2);
	    }

	    public static void main(String[] args) {
	        List<String> stringNumbers = new ArrayList<>();
	        stringNumbers.add("5");
	        stringNumbers.add("23");
	        stringNumbers.add("10");
	        stringNumbers.add("7");
	        stringNumbers.add("2");

	        System.out.println("Before sorting: " + stringNumbers);

	        bubbleSort(stringNumbers);

	        System.out.println("After sorting: " + stringNumbers);
	    }
}
