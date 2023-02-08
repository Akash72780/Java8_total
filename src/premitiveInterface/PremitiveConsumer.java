package premitiveInterface;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public interface PremitiveConsumer {
	
	public IntConsumer iC=value->System.out.println(value*value);
	public LongConsumer lC=value->System.out.println(value*value);
	public DoubleConsumer dC=value->System.out.println(value*value);
	
	public ObjIntConsumer<String> oiC=(name,salary)->System.out.println(name+" gets "+String.valueOf(salary));
	public ObjLongConsumer<String> olC=(name,salary)->System.out.println(name+" gets in a year of "+String.valueOf(salary));
	public ObjDoubleConsumer<String> odC=(name,salary)->System.out.println(name+" gets dailywages "+String.valueOf(salary));
	
	public static void main(String[] arg) {
		iC.accept(23);
		lC.accept(23L);
		dC.accept(23.56);
		oiC.accept("Bikash", 2000);
		olC.accept("Rahul", 22L);
		odC.accept("Pritam", 23.50);
	}

}
