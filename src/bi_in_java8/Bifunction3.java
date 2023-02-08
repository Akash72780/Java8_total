package bi_in_java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import orm.CEmployee;
import orm.CTimesheet;

//calculate the total salary to the list of employee
public interface Bifunction3 {
	
	public BiFunction<CEmployee, CTimesheet, Float> calculate=(elist,tlist)->{
		float result=0;
		if(elist.eno==tlist.eno)
			result=elist.dailyWage * tlist.noOfDays;
		
		return result;
	};
	
	public static void main(String[] arg) {
		List<CEmployee> arrEmp=new ArrayList<>();
		arrEmp.add(new CEmployee(1, "Bikash", 550));
		arrEmp.add(new CEmployee(2, "Rahul", 320));
		arrEmp.add(new CEmployee(3, "Ratul", 870));
		arrEmp.add(new CEmployee(4, "Polo", 230));
		arrEmp.add(new CEmployee(5, "Jondis", 490));
		
		List<CTimesheet> arrTime=new ArrayList<>();
		arrTime.add(new CTimesheet(1, 23));
		arrTime.add(new CTimesheet(2, 54));
		arrTime.add(new CTimesheet(3, 34));
		arrTime.add(new CTimesheet(4, 65));
		arrTime.add(new CTimesheet(5, 41));
		
		float total=0;
		for(int i=0;i<arrEmp.size();i++)
			total+=calculate.apply(arrEmp.get(i), arrTime.get(i));
		
		System.out.println("total is "+total);
	}

}
