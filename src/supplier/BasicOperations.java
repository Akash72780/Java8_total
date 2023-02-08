package supplier;

import java.util.Date;
import java.util.function.Supplier;
//find the system dates
public interface BasicOperations {
	public Supplier<Date> sysDt=()->{
		return new Date();
	};
	
	public static void main(String[] arg) {
		System.out.println(sysDt.get());
	}

}
