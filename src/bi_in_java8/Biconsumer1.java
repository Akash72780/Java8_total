package bi_in_java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import orm.CEmployee;
import orm.CTimesheet;

//calculate the total salary to the list of employee
public interface Biconsumer1 {
	
	public BiConsumer<List<CEmployee>, List<CTimesheet>> calculate=(arrEmp,arrTime)->{
		float total=0;
		for(int i=0;i<arrEmp.size();i++) {
			if(arrEmp.get(i).eno==arrTime.get(i).eno)
				total+=arrEmp.get(i).dailyWage*arrTime.get(i).noOfDays;
		}
		System.out.println("total is "+total);
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
		
		calculate.accept(arrEmp, arrTime);
	}

}
