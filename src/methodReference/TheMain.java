package methodReference;

import java.util.function.BiFunction;

//main boundary of method reference is that the argument should be same.
//if return type is different then the method of interface should take priority
public class TheMain {

	public static void main(String[] args) {
		
		//refer the class instance
		ReferClass rC=new ReferClass();
		Interf obj=rC::display;
		obj.show();
		
		//refer the static method
		obj=ReferStaticClass::staticDisplay;
		obj.show();
		
		//refer with arguments
		Refer_with_arg rfa=new Refer_with_arg();
		Interf_with_arg obj1=rfa::calculate;
		
		System.out.println(obj1.calculate(20, 30));
		
		//method reference for Function
		BiFunction<Integer, Integer, Integer> biFunction=rfa::calculate;
		System.out.println("it is function with value "+biFunction.apply(23, 12));
		
	}

}
