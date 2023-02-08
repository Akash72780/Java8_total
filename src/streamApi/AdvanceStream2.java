package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AdvanceStream2 {

	public static void main(String[] args) {
		List<Integer> arrList=Arrays.asList(34,23,54,55,65,34,22,76);
		
		//print the count of numbers which is greater than 50
		Predicate<Integer> greaterCheck=value->value>50;
		System.out.println(arrList.stream().filter(greaterCheck).count());
		
		//Sort the array
		System.out.println(arrList.stream().sorted((a,b)->a.compareTo(b)).collect(Collectors.toList()));
		
		//find the minimum number
		System.out.println(arrList.stream().min((a,b)->a.compareTo(b)).get());
		
		//find the maximum number
		System.out.println(arrList.stream().max((a,b)->a.compareTo(b)).get());
		
		//print the element which is greater than 50
		arrList.stream().filter(greaterCheck).forEach(value->System.out.println(value));
		
	}

}
