package methodReference;

public class IntPredicateChecker {
	// A static method for checking if  a number is positive
    public static boolean isPositive(int n) {
        return n > 0;
    }

    // A static method for checking if a number is even
    public static boolean isEven(int n) {
        return (n % 2) == 0;
    }
}
