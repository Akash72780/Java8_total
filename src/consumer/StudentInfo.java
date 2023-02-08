package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import orm.Student;

//get the student names from list who is scored 80 above
public class StudentInfo {
	
	public static Predicate<Student> p=stu->stu.marks>80;
	public static Consumer<Student> c=stu->System.out.println(stu.name);
	
	public static void main(String[] arg) {
		List<Student> arrList=new ArrayList<>();
		arrList.add(new Student("Akash", 76, "B"));
		arrList.add(new Student("Bikash", 87, "A"));
		arrList.add(new Student("Poulami", 99, "A"));
		arrList.add(new Student("Ratul", 98, "A"));
		arrList.add(new Student("Rakesh", 45, "C"));
		
		for(Student stu:arrList)
			if(p.test(stu))
				c.accept(stu);
		
	}

}
