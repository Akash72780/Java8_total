package bi_in_java8;

import java.util.Scanner;
import java.util.function.BiPredicate;

//find the greater numbers between 2 numbers
public interface Bipredicate {
	
	public BiPredicate<Integer, Integer> greaterThan=(a,b)->a>b;
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(greaterThan.test(a,b))
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
	}

}
