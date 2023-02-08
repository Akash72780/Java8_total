package premitiveInterface;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public interface PremitivePredicate {
	
	public IntPredicate ip=value->value>10;
	public LongPredicate lp=value->value>50.54;
	public DoublePredicate dp=value->value<23.4;
	
	public static void main(String[] main) {
		System.out.println(ip.test(45));
		System.out.println(lp.test(345L));
		System.out.println(dp.test(23.2));
	}
	
}
