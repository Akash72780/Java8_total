package premitiveInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public interface Operators {
	
	//UnaryOperator acts as a Function interface only difference is that if argument and return type same of a function..
	public UnaryOperator<Integer> uo=(value)->value+500;
	//BinaryOperator acts as a BiFunction interface only difference is that if argument and return type same of a function..
	public BinaryOperator<String> bo=(name,title)->"First name: "+name+" Last name: "+title;
	
	public IntUnaryOperator iuo=(value)->value*value;
	public IntBinaryOperator ibo=(value1,value2)->value1+value2;
	//same as Long,Double premitive data type
	
	public static void main(String[] arg) {
		
		System.out.println(uo.apply(3000));
		System.out.println(bo.apply("Vijay", "Debrakonda"));
		System.out.println(iuo.applyAsInt(15));
		System.out.println(ibo.applyAsInt(34,43));
	}
	
}
