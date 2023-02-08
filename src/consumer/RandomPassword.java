package consumer;

import java.util.Random;
import java.util.function.Supplier;

//generate 8 digit password whose 2,4,6,8 index is digit and others are alphabets
public class RandomPassword {
	
	public static void main(String[] arg) {
		Supplier<String> randomPass=()->{
			Random random=new Random();
			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@%&$";
			String result="";
			for(int i=0;i<8;i++) {
				if(i%2!=0) {
					result+=String.valueOf(random.nextInt(9));
				}
				else {
					result+=String.valueOf(alphabet.charAt(random.nextInt(alphabet.length())));
				}
			}
			return result;
		};
		
		System.out.println(randomPass.get());
	}

}
