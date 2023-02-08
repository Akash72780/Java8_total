package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import orm.Employee;
//find the employee from list who live in kolkata and salary is less than 55000 &b greater than 35000
public class Final_test {
	
	static Predicate<Employee> p1=emp->55000>=emp.salary && emp.salary>35000;
	static Predicate<Employee> p2=emp->emp.city.equals("kolkata");
	
	public static void main(String[] arg) {
		
		List<Employee> arrList=new ArrayList<>();
		
		arrList.add(new Employee("Akash", "Developer", 50000, "kolkata"));
		arrList.add(new Employee("Bikash", "CEO", 30000, "pune"));
		arrList.add(new Employee("Praksh", "Developer", 65000, "kolkata"));
		arrList.add(new Employee("Poulami", "Designer", 35000, "kolkata"));
		arrList.add(new Employee("Rahul", "Developer", 55000, "Pune"));

		evalute(p1.and(p2), arrList);
	
	}
	
	public static void evalute(Predicate<Employee> p,List<Employee> list) {
		
		for(Employee emp:list)
			if(p.test(emp))
				System.out.println(emp);
	}

}
