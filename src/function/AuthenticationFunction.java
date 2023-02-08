package function;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

import orm.User;

//check user name and password using function
public class AuthenticationFunction {
	
	final static Function<User, User> check5= user->{
		String first5=user.getUsername().toUpperCase().substring(0,5);
		user.setUsername(first5);
		return user;
	};
	
	final static Predicate<User> checkCreadential= user-> user.getUsername().equals("AKASH") && user.getPwd().equals("java");

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter user:");
		String username=sc.next();
		
		System.out.println("Enter password:");
		String password=sc.next();
		
		User user=new User(username, password);
		
		if(checkCreadential.test(check5.apply(user)))
			System.out.println("Authenticate");
		else
			System.out.println("Invalid credential");

	}

}
