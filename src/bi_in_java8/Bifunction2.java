package bi_in_java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import orm.User;

//enter user and pwd into a list and show their names
public interface Bifunction2 {
	
	public BiFunction<String, String, User> createUser=(a,b)->new User(a,b);
	public Predicate<String> checkValue=Predicate.isEqual("stop");
	public Function<List<User>, List<String>> getAllUser=(list)->{
		List<String> listUser=new ArrayList<>();
		for(User user:list)
			listUser.add(user.username);
		return listUser;
	};
	
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		String value1="",value2="";
		List<User> arrList=new ArrayList<>();
		
		while(true) {
			System.out.println("Enter username & password to submit or enter stop to stop");
			value1=sc.next();
			if(checkValue.test(value1))
				break;
			value2=sc.next();
			arrList.add(createUser.apply(value1, value2));
		}
		System.out.println("list of users: "+getAllUser.apply(arrList));
		
	}

}
