package methodReference;

import java.util.Scanner;

public class StaticMethodReferenceDemo {
	
	
	//constructor
	public StaticMethodReferenceDemo() {
    }

    // This method takes a functional interface as the type of its first parameter. Thus it can accept a reference to any
	//	instance of that interface, including one created by a method reference
    public boolean numCheck(IntPredicate p, int n) {
        return p.check(n);
    }

    public static void main(String[] args) {
        StaticMethodReferenceDemo demo = new StaticMethodReferenceDemo();
        
        Scanner sc = new Scanner(System.in);
        boolean result;
        System.out.println("enter the number");
        int num = sc.nextInt(); 
        // Here, Using lambda expression to check if a number is even
        IntPredicate lb1 = number -> (number % 2) ==0;
        result = demo.numCheck(lb1, num);
        System.out.println("Using lambda expression: " + num + " is even: " + result);

        // Here, a method reference to  static method isEven of IntPredicatesChecker is passed to numCheck().
        result = demo.numCheck(IntPredicateChecker::isEven, num);
        System.out.println("Using static method reference: " + num + " is even: " + result);

        
        
        
        
        // Here, Using lambda expression to check if a number is positive
        IntPredicate lb2 = number -> number > 0;
        result = demo.numCheck(lb2, num);
        System.out.println("Using lambda expression: " + num + " is positive: " + result);

        // Here, a method reference to  static method isPositive of IntPredicatesChecker is passed to numCheck().
        result = demo.numCheck(IntPredicateChecker::isPositive, num);
        System.out.println("Using static method reference: " + num + " is positive: " + result);

    }
}
