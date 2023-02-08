package bi_in_java8;

import java.util.Scanner;
import java.util.function.BiFunction;

//find the greatest numbers from 3 numbers
public interface Bifunction1 {
	
	public BiFunction<Integer, Integer, Integer> greatest=(a,b)->a>b?a:b;
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Input three number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(greatest.apply(a, b)==greatest.apply(a, c))
			System.out.println(a+" is the greatest");
		else if(greatest.apply(b,a)==greatest.apply(b, c))
			System.out.println(b+" is greatest");
		else
			System.out.println(c+" is greatest");
	}

}
