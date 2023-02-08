package predicate;

import java.util.Scanner;
import java.util.function.Predicate;

import orm.User;

//Authenticate user name and password by static value
public interface Predicate_Authentication1 {
	
	public static void main(String[] arg) {
		
		Predicate<User> p=user->user.username.equals("Akash") && user.pwd.equals("akash");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User name");
		String name=sc.next();
		System.out.println("Enter password");
		String pass=sc.next();
		
		User user=new User(name, pass);
		
		if(p.test(user))
			System.out.println("Authenticated");
		else
			System.out.println("Invaild credential");
	}

}
