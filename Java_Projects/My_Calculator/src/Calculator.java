import java.lang.Math;
import java.util.Scanner;  


/*
 
 The calculator class provides functionalities of each calculator features and calls each 
 one of the functions from the User Input class. 
 
 */

public class Calculator {
	
	private static Scanner input_add; 
	private static Scanner input_subtract; 
	private static Scanner input_multiply; 
	private static Scanner input_division; 
	
	private static float input_one;
	private static float input_two;
	private static float input_three = 1; 
	private static float input_four = 1; 
	
	private static float adding = 0; 
	private static float subtracting = 0; 
	private static float multiplying = 0; 
	private static float dividing = 0;  
	
	
	//Feature functions 
	public static float addition(float number_additions) { 
		
		input_add = new Scanner(System.in); 
	 
		for (int i = 0; i < number_additions; i++) {
			System.out.println("Enter your numbers: ");
			input_one = input_add.nextFloat(); 
			adding += input_one; 
		}
		Data_Answers.stack_answers_addition.add(adding); 
		Data_Answers.combination.add(adding); 
		return adding; 
	}
	
	public static float subtraction(float number_subtraction) {
		
		input_subtract = new Scanner(System.in); 
		
		for (int i = 0; i < number_subtraction; i++) {
			System.out.println("Enter your numbers: ");
			input_two = input_subtract.nextFloat(); 
			subtracting -= input_two; 
		}
		Data_Answers.stack_answers_subtraction.add(subtracting); 
		Data_Answers.combination.add(subtracting); 
		return subtracting;  
	}
	
	public static float multiplication(float number_multiplication) {
		
		input_multiply = new Scanner(System.in);  
		
		for (int i = 1; i <= number_multiplication; i++) {
			System.out.println("Enter your numbers: ");
			input_three = input_multiply.nextFloat(); 
			multiplying *= input_three; 
		}
		Data_Answers.stack_answers_multiplication.add(multiplying); 
		Data_Answers.combination.add(multiplying); 
		return multiplying; 
	}
	
	public static float Division(float number_division) {
		input_division = new Scanner(System.in); 
		
		for (int i = 1; i <= number_division; i++) {
			System.out.println("Enter your numbers: ");
			input_four = input_division.nextFloat(); 
			dividing /= input_four; 
		}
		Data_Answers.stack_answers_division.add(dividing); 
		Data_Answers.combination.add(dividing); 
		return dividing; 
	}
	
	public static float Modular(float a, float b) {
		float answer = a % b; 
		Data_Answers.stack_answers_modular.add(answer); 
		Data_Answers.combination.add(answer); 
		return answer; 
	}
	
	public static float Square_Root(float a) {
		float answer = (float) Math.sqrt(a); 
		Data_Answers.stack_answers_squareRoot.add(answer); 
		Data_Answers.combination.add(answer); 
		return answer; 
	}
	
	public static Float Power_number(float a, float b) {
		float answer = (float) Math.pow(a, b); 
		Data_Answers.stack_answers_squareRoot.add(answer); 
		Data_Answers.combination.add(answer); 
	    return answer; 
	}
	
	public static float Pythagorean(float a, float b) { 
		float part = (float) ((float) Math.pow(a, 2) + Math.pow(b, 2)); 
		float answer = (float) Math.sqrt(part); 
		Data_Answers.stack_answers_pythagoreanTheorem.add(answer); 
		Data_Answers.combination.add(answer); 
		return answer; 
	}
	
	public static float GCD(float a, float b) {
		while (a != b) {
			if (a > b) {
				a = a - b; 
			}
			else {
				b = b - a; 
			}
		}
		Data_Answers.stack_answers_GCD.add(b); 
		Data_Answers.combination.add(b); 
		return b;  
	}

	
	
	
	
	
	
	
	
	
	
}
