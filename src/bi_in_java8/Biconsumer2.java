package bi_in_java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import orm.BEmployee;

//increment salary whose salary is less than 60000 after checking
public interface Biconsumer2 {
	
	public BiFunction<String, Integer, BEmployee> createEmp=(name,salary)->new BEmployee(name, salary);
	public Predicate<BEmployee> checkSalary=(emp)->emp.salary<60000;
	public BiConsumer<BEmployee, Integer> increment=(emp,salary)->emp.salary+=salary;
	
	public static void main(String[] arg) {
		List<BEmployee> arrList=new ArrayList<>();
		
		arrList.add(createEmp.apply("Akash", 55000));
		arrList.add(createEmp.apply("Bikash", 30000));
		arrList.add(createEmp.apply("Praksh", 65000));
		arrList.add(createEmp.apply("Poulami", 35000));
		arrList.add(createEmp.apply("Rahul", 55000));
		
		for(BEmployee emp:arrList)
			if(checkSalary.test(emp))
				increment.accept(emp, 5000);
		
		System.out.println("After increment::");
		System.out.println(arrList);
	}
}
