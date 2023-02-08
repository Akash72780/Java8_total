package supplier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import orm.Movie;
//find the random movie name from the list
public interface RandomNameFromList {
	
	public static void main(String[] arg) {
		List<Movie> arrList=new ArrayList<>();
		arrList.add(new Movie("Bahubali", "march", 24000));
		arrList.add(new Movie("Avatar", "feb", 85000));
		arrList.add(new Movie("Drisham", "march", 54000));
		arrList.add(new Movie("avenger", "march", 98000));
		arrList.add(new Movie("void", "april", 39000));
		arrList.add(new Movie("xmen", "march", 67000));
		arrList.add(new Movie("titanic", "april", 87000));
		
		Supplier<String> randomName=()->{
			Random random=new Random();
			return arrList.get(random.nextInt(7)).name;
		};
		
		System.out.println("random name is : "+randomName.get());
	}

}
