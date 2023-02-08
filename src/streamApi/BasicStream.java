package streamApi;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStream {

	public static void main(String[] args) {
		
		List<Integer> arrList=Arrays.asList(3,5,4,7,6,8,10);
		List<Integer> result=null;
		
		System.out.println("find the value which is even");
		result= arrList.stream()				//convert it into stream object
				.filter(value->value%2==0)		//filter all even value using lamba expression
				.collect(Collectors.toList());	//collect all the number and convert it into list
		System.out.println(result);
		
		System.out.println("Multi by 3 with all numbers");
		result=arrList.stream()					//convert it into stream object
				.map(value->value*2)			//map every value with its double value
				.collect(Collectors.toList());	//collect all the number and convert it into list
		System.out.println(result);
		
		System.out.println("find the even value and square it");
		result=arrList.stream()
				.filter(value->value%2==0)
				.map(value->value*value)
				.collect(Collectors.toList());
		System.out.println(result);

	}

}
