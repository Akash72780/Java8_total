package function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import orm.Student;

//Decide the student's grade based on their marks
public interface FunctionOnMarks {
	
	public Function<Student, String> f=value-> value.getMarks()>=80?"A[First Class]":value.getMarks()>=60 && value.getMarks()<80?"B[Second Class]":"C[Third Class]";
	
	public static void main(String[] arg) {
		List<Student> arrList=new ArrayList<>();
		arrList.add(new Student("Akash", 76, ""));
		arrList.add(new Student("Bikash", 87, ""));
		arrList.add(new Student("Poulami", 99, ""));
		arrList.add(new Student("Ratul", 98, ""));
		arrList.add(new Student("Rakesh", 45, ""));
		evaluate(f, arrList);
		System.out.println(arrList);
	}
	
	public static void evaluate(Function<Student, String> f,List<Student> list) {
		
		for(Student stu:list)
			stu.setGrade(f.apply(stu));
		
	}

}
