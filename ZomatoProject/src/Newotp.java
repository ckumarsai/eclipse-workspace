import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Newotp {

	public String mobilenumber;

	public void generateOtp() {
		// Length of your otp as I have choose
		// here to be 6
		int length = 6;
		System.out.println(geek_Password(length));
	}

	// make any object for it
//    Scanner scn = new Scanner(System.in);
	static char[] geek_Password(int len) {

		System.out.println("Generating otp  : ");
		System.out.print("Your  otp is : ");

		String numbers = "0123456789";

		String values = numbers;

//         Using random method
		Random rndm_method = new Random();

		char[] otp = new char[len];

		for (int i = 0; i < len; i++) {
			otp[i] = values.charAt(rndm_method.nextInt(values.length()));

		}
		return otp;
	}
	public static boolean isValidMobileNumber(String str) {
		Pattern ptr=Pattern.compile("[0-9]");
		Matcher match=ptr.matcher(str);
		
		return (match.find() && match.group().equals(str)); 
		
	}

}
