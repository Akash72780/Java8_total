package contructorReference;

import java.util.function.Function;

import orm.Sample_with_arg;
import orm.Sample_without_arg;

public class TheMain {

	public static void main(String[] args) {
		//Constructor reference without argument
		Constructor_inferface_without_arg constructor_inferface_without_arg=Sample_without_arg::new;
		//Constructor reference with arguments
		Constructor_inferface_with_arg constructor_inferface_with_arg=Sample_with_arg::new;
		
		constructor_inferface_without_arg.get();
		constructor_inferface_with_arg.get(10);
		
		//Function for constructor reference
		Function<Integer, Sample_with_arg> f1=Sample_with_arg::new;
		f1.apply(10);

	}

}
