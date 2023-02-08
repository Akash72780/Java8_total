package search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheMain {

	public static void main(String[] args) {
		
		List<Student> arrStu=new ArrayList<>();
		arrStu.add(new Student("Prakash", 34, 45));
		arrStu.add(new Student("Akash", 19, 24));
		arrStu.add(new Student("Sayan", 65, 76));
		arrStu.add(new Student("Sandipan", 22, 22));
		arrStu.add(new Student("Rakesh", 34, 59));
		
		//using comparable sort by roll
		Collections.sort(arrStu);
		
		//using external Comparator sort by marks
		arrStu.sort(new SortByMarks());
		//or
		Collections.sort(arrStu, new SortByMarks());
		
		//using lamba expression sort by roll
		arrStu.sort((o1,o2)->{
			if(o1.getRoll()<o2.getRoll())
				return -1;
			else if (o1.getRoll()>o2.getRoll()) {
				return 1;
			}else
				return 0;
		});
		//or
		Collections.sort(arrStu,(o1,o2)->{
			if(o1.getRoll()<o2.getRoll())
				return -1;
			else if (o1.getRoll()>o2.getRoll()) {
				return 1;
			}else
				return 0;
		});
		
		System.out.println(arrStu);

	}

}
