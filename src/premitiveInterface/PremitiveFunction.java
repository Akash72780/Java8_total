package premitiveInterface;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public interface PremitiveFunction {
	
	public IntFunction<String> iF=value->String.valueOf(value);
	public LongFunction<String> lF=value->String.valueOf(value);
	public DoubleFunction<String> dF=value->String.valueOf(value);
	
	public ToIntFunction<String> tiF=str->str.length();
	public ToDoubleFunction<String> tdF=str->str.length();
	public ToLongFunction<String> tlF=str->str.length();
	
	public IntToDoubleFunction itdF=value->value/3;
	public IntToLongFunction itlF=value->value/7;
	
	public LongToIntFunction ltiF=value->Math.toIntExact(value);
	public LongToDoubleFunction ltdF=value->(double)value;
	
	public DoubleToIntFunction dtiF=value->(int)value;
	public DoubleToLongFunction dtlF=value->(long)value;
	
	public ToIntBiFunction<String, String> tibF=(name,title)->name.length()-title.length();
	public ToLongBiFunction<String, String> tlbF=(name,title)->name.length()/title.length();
	public ToDoubleBiFunction<String, String> tdbF=(name,title)->name.length()/title.length();
	
	public static void main(String[] arg) {
		System.out.println(iF.apply(24));
		System.out.println(lF.apply(34L));
		System.out.println(dF.apply(34.54));
		System.out.println(tiF.applyAsInt("Prakash"));
		System.out.println(tdF.applyAsDouble("Prakash"));
		System.out.println(tlF.applyAsLong("Prakash"));
		System.out.println(itdF.applyAsDouble(20));
		System.out.println(itlF.applyAsLong(22));
		System.out.println(ltiF.applyAsInt(23L));
		System.out.println(ltdF.applyAsDouble(34L));
		System.out.println(dtiF.applyAsInt(23.54));
		System.out.println(dtlF.applyAsLong(23.76));
		
		System.out.println(tibF.applyAsInt("Physics", "Data"));
		System.out.println(tlbF.applyAsLong("Physics", "Data"));
		System.out.println(tdbF.applyAsDouble("Physics", "Data"));
	}

}
