package consumer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import orm.Movie;

//find the movie name which is released on march and hit the box office by 70000
public class OperationOnMovie {

	public static void main(String[] args) {
		List<Movie> arrList=new ArrayList<>();
		arrList.add(new Movie("Bahubali", "march", 24000));
		arrList.add(new Movie("Avatar", "feb", 85000));
		arrList.add(new Movie("Drisham", "march", 54000));
		arrList.add(new Movie("avenger", "march", 98000));
		arrList.add(new Movie("void", "april", 39000));
		arrList.add(new Movie("xmen", "march", 67000));
		arrList.add(new Movie("titanic", "april", 87000));
		
		Predicate<Movie> checkOnMonth=mv->mv.releaseMonth.equals("march");
		Predicate<Movie> checkOnCollection=mv->mv.boxOfcCollection>70000;
		
		Consumer<Movie> notification=mv->{
			System.out.println("released in march");
			if(checkOnMonth.test(mv))
				System.out.println(mv.name);
		};
		Consumer<Movie> collection=mv->{
			System.out.println("HitMovie");
			if(checkOnCollection.test(mv))
				System.out.println(mv.name);
		};
		
		Consumer<Movie> mainConsumer=notification.andThen(collection);
		
		for(Movie mv:arrList)
			mainConsumer.accept(mv);
	}

}
