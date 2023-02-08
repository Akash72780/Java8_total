package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import orm.Employee;

//find the employee from list who live in kolkata and salary is less than 60000
public interface Employee_Management {
	
	public static void main(String[] arg) {
		List<Employee> arrList=new ArrayList<>();
		
		arrList.add(new Employee("Akash", "Developer", 55000, "kolkata"));
		arrList.add(new Employee("Bikash", "CEO", 30000, "pune"));
		arrList.add(new Employee("Praksh", "Developer", 65000, "kolkata"));
		arrList.add(new Employee("Poulami", "Designer", 35000, "kolkata"));
		arrList.add(new Employee("Rahul", "Developer", 55000, "Pune"));
		
		Predicate<Employee> p1=emp->emp.salary<60000;
		Predicate<Employee> p2=emp->emp.city.equals("kolkata");
		
		Predicate<Employee> p=p1.and(p2);
		
		for(Employee emp:arrList)
			if(p.test(emp))
				System.out.println(emp);
	}

}
