package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//find the person whose name is starts with P by excluding null and empty name from list
public interface Predicate_Example2 {
	
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Akash","Poulami","","Prakash",null,"Susmita","Prabal");
		Predicate<String> name_Predicate=name->name.startsWith("P");
		Predicate<String> null_Predicate=name->name==null;
		Predicate<String> empty_Predicate=name->name.length()==0;
		method_Predicate((null_Predicate.negate()).and(empty_Predicate.negate()).and(name_Predicate), names);
	}
	
	public static void method_Predicate(Predicate<String>p,List<String> names) {
		for(String name:names) {
			if(p.test(name))
				System.out.println(name);
		}
	}

}
