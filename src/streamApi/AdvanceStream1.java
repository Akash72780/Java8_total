package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import search.Student;

public class AdvanceStream1 {

	public static void main(String[] args) {
		
		List<Student> arrStu=new ArrayList<>();
		arrStu.add(new Student("Prakash", 34, 45));
		arrStu.add(new Student("Akash", 19, 24));
		arrStu.add(new Student("Sayan", 65, 76));
		arrStu.add(new Student("Sandipan", 22, 22));
		arrStu.add(new Student("Rakesh", 34, 59));
		
		//find the student who score more than 40
		Predicate<Student> markSelect=stu->stu.getMarks()>40;
		List<Student> result=arrStu.stream().filter(markSelect).collect(Collectors.toList());
		System.out.println("Student gets more than 40");
		System.out.println(result);
		
		//find the student's name who score more than 40
		Function<Student, String> nameSelect=stu->stu.getName();
		List<String> names=arrStu.stream().filter(markSelect).map(nameSelect).collect(Collectors.toList());
		System.out.println("Student's name gets more than 40");
		System.out.println(names );
	}

}
