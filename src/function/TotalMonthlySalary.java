package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import orm.Employee;
// find the employee form list whose salary is less than 40k and increment that by 500 and get the total salary
public interface TotalMonthlySalary {
	
	final Function<List<Employee>, Integer> totalSalary= list->{
		int total=0;
		for(Employee emp:list)
			total+=emp.salary;
		return total;
	};
	
	final Function<Employee, Employee> incrementSalary=emp->{
		emp.setSalary(emp.getSalary()+500);
		return emp;
	};
	
	final Predicate<Employee> checkSalary=emp->emp.getSalary()<40000;
	
	public static void main(String[] arg) {
		
		List<Employee> arrList=new ArrayList<>();
		
		arrList.add(new Employee("Akash", "Developer", 55000, "kolkata"));
		arrList.add(new Employee("Bikash", "CEO", 30000, "pune"));
		arrList.add(new Employee("Praksh", "Developer", 65000, "kolkata"));
		arrList.add(new Employee("Poulami", "Designer", 35000, "kolkata"));
		arrList.add(new Employee("Rahul", "Developer", 55000, "Pune"));
		
		List<Employee> result=new ArrayList<>();
		
		for(Employee emp:arrList) {
			if(checkSalary.test(emp))
				result.add(incrementSalary.apply(emp));
				
		}
		
		System.out.println("Before increment:");
		System.out.println(arrList);
		
		System.out.println("After increament of:");
		System.out.println(result);
		
		System.out.println("Total Salary is:");
		System.out.print(totalSalary.apply(arrList));
	}

}
