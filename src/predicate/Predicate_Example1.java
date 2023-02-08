package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

//find the numbers from list which is greater than 10 and odd numbers
public interface Predicate_Example1 {
	
	public static void main(String[] arg) {
		List<Integer> arr=Arrays.asList(5,23,7,45,12,45,77,9);
		Predicate<Integer> greaterThan10=i->i>10;
		Predicate<Integer> oddNumber=i->i%2>0;
		
		System.out.println("greater than 10");
		m1(greaterThan10, arr);
		
		System.out.println("\nLess than 10");
		m1(greaterThan10.negate(), arr);
		
		System.out.println("\nodd Number");
		m1(oddNumber,arr);
		
		System.out.println("\neven number");
		m1(oddNumber.negate(), arr);
		
		System.out.println("\nGreater that 10 and odd");
		m1(greaterThan10.and(oddNumber), arr);
		
		System.out.println("\nGreater that 10 and even");
		m1(greaterThan10.and(oddNumber.negate()), arr);
		
		
	}
	
	public static void m1(Predicate<Integer> p, List<Integer> arr) {
		for(int element:arr) {
			if(p.test(element))
				System.out.print(element+",");
		}
	}

}
