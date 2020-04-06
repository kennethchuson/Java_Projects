import java.lang.Math;  

public class Calculator {
	
	
	
	//Feature functions 
	public static String addition(float a, float b) { 
		return Float.toString(a + b); 
	}
	
	public static String subtraction(float a, float b) {
		return Float.toString(a - b); 
	}
	
	public static String multiplication(float a, float b) {
		return Float.toString(a * b); 
	}
	
	public static String Division(float a, float b) {
		return Float.toString(a / b); 
	}
	
	public static String Modular(float a, float b) {
		return Float.toString(a % b); 
	}
	
	public static String Square_Root(float a) {
		return Float.toString((float) Math.sqrt(a)); 
	}
	
	public static String Power_number(int a, int b) {
	   return Float.toString((int) Math.pow(a, b)); 
	}
	
	public static String Pythagorean(float a, float b) { 
		float a1 = (float) (Math.pow(a, 2) + Math.pow(b, 2)); 
		return Float.toString((float) Math.sqrt(a1)); 
	}
	
	public static String GCD(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b; 
			}
			else {
				b = b - a; 
			}
		}
		return Float.toString(b); 
	}

	
	
	
	
	
	
	
	
	
	
}
