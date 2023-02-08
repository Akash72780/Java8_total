package premitiveInterface;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public interface PremitiveSupplier {
	
	public IntSupplier iS=()->{
		Random random=new Random();
		return random.nextInt(9);
	};
	
	public LongSupplier lS=()->{
		return 22/7;
	};
	
	public DoubleSupplier dS=()->{
		return 10/3;
	};
	
	public BooleanSupplier bS=()->true;

	public static void main(String[] arg) {
		System.out.println(iS.getAsInt());
		System.out.println(lS.getAsLong());
		System.out.println(dS.getAsDouble());
		System.out.println(bS.getAsBoolean());
	}
}
