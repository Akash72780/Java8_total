package function;

import java.util.function.Function;

//omit the space in a line
public interface OperationOnString {
	
	public static void main(String[] arg) {
		Function<String, String> f= str->str.replaceAll(" ", "");
		String input="twinkle twinkle little stars";
		
		System.out.println(f.apply(input));
	}

}
