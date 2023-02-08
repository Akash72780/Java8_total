package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import search.Student;

public class AdvanceStream3 {

	public static void main(String[] args) {
		
		List<Student> arrStu=new ArrayList<>();
		arrStu.add(new Student("Prakash", 34, 45));
		arrStu.add(new Student("Akash", 19, 24));
		arrStu.add(new Student("Sayan", 65, 76));
		arrStu.add(new Student("Sandipan", 22, 22));
		arrStu.add(new Student("Rakesh", 34, 59));
		
		//increase every marks by 10
		Consumer<Student> marksChange=stu->stu.setMarks(stu.getMarks()+10);
		arrStu.stream().forEach(marksChange);
		System.out.println(arrStu);
		
		//convert list to array
		Integer[] marks=arrStu.stream().map(stu->stu.getMarks()).toArray(Integer[]::new);
		for (Integer value : marks) {
			System.out.println(value);
		}
		
		//convert array to stream
		Stream<Integer> streamArray=Stream.of(marks);
		
		//print the marks which is greater than 50 from marks array
		System.out.println("values are: ");
		Stream.of(marks).filter(value->value>50).forEach(System.out::println);

	}

}
