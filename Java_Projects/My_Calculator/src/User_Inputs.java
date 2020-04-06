import java.util.Scanner;
import java.util.Stack;

public class User_Inputs {
	
	public static String select_option; 
	public static String name; 
	public static float input_one; 
	public static float input_two; 
	public static int int_input_one; 
	public static int int_input_two; 
	public static boolean again_calculator = true; 
	
	private static Scanner inputName, input, input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12, input13, input14, input15, input16, input17, input18;

       //Creating stacks for history answers. 
	static Stack<String> stack_answers_addition = new Stack<>();
	static Stack<String> stack_answers_subtraction = new Stack<>(); 
	static Stack<String> stack_answers_multiplication = new Stack<>(); 
	static Stack<String> stack_answers_division = new Stack<>(); 
	static Stack<String> stack_answers_modular = new Stack<>(); 
	static Stack<String> stack_answers_squareRoot = new Stack<>(); 
	static Stack<String> stack_answers_powerNumber = new Stack<>(); 
	static Stack<String> stack_answers_GCD = new Stack<>(); 
	static Stack<String> stack_answers_pythagoreanTheorem = new Stack<>(); 
	

	public static void inputs() {
		

		
		inputName = new Scanner(System.in); 
		input = new Scanner(System.in);
		input1 = new Scanner(System.in); 
		input2 = new Scanner(System.in); 
		input3 = new Scanner(System.in);
		input4 = new Scanner(System.in); 
		input5 = new Scanner(System.in); 
		input6 = new Scanner(System.in); 
		input7 = new Scanner(System.in); 
		input8 = new Scanner(System.in); 
		input9 = new Scanner(System.in); 
		input10 = new Scanner(System.in); 
		input11 = new Scanner(System.in); 
		input12 = new Scanner(System.in); 
		input13 = new Scanner(System.in);
		input14 = new Scanner(System.in); 
		input15 = new Scanner(System.in); 
		input16 = new Scanner(System.in); 
		input17 = new Scanner(System.in); 
		input18 = new Scanner(System.in); 
		
		System.out.println("WELCOME TO MY CALCUATOR");
		
	
	    System.out.println("Please enter your name: ");
	    name = inputName.nextLine();
	    
	    //Input validation 
	    while (!name.matches("[a-zA-Z ,]+")) {
	        System.out.println("WARNING: Should be letters not numbers or symbols");
	        name = inputName.nextLine();
	    }
	    
	    System.out.println("hello " + name + "!");
	 
		    	
		    	 //Check whether to see if you want to go back to the calculator options or not. 
			    while (again_calculator) {
	
			        //Display features and user input selection. 
			        Display.Operations(); 
			        select_option = input.nextLine(); 
			        
			     
			        //Input Validation
			        while (!select_option.matches("[a-zA-Z ,]+")) {
			        	System.out.println("WARNING: Should be uppercase letter not numbers");
			        	select_option = input.nextLine(); 
			        }
			       
			        
			        switch (select_option) {
				        case "A": 
				        	again_calculator = false; 
				        	break; 
						case "B":
							System.out.println("Enter first number: ");
							input_one = input1.nextFloat(); 
							System.out.println("Enter second number: ");
							input_two = input2.nextFloat(); 
							System.out.println("result " + Calculator.addition(input_one, input_two));
							stack_answers_addition.push(Calculator.addition(input_one, input_two));
							again_calculator = true; 
							break;
						case "C":
							System.out.println("Enter first number: ");
							input_one = input3.nextFloat(); 
							System.out.println("Enter second number: ");
							input_two = input4.nextFloat(); 
							System.out.println("result " + Calculator.subtraction(input_one, input_two));
							stack_answers_subtraction.push(Calculator.subtraction(input_one, input_two)); 
							again_calculator = true; 
							break; 
						case "D": 
							System.out.println("Enter first number: ");
							input_one = input5.nextFloat(); 
							System.out.println("Enter second number: ");
							input_two = input6.nextFloat(); 
							System.out.println("result " + Calculator.multiplication(input_one, input_two));
							stack_answers_multiplication.push(Calculator.multiplication(input_one, input_two)); 
							again_calculator = true; 
							break; 
						case "E": 
							System.out.println("Enter first number: ");
							input_one = input7.nextFloat(); 
							System.out.println("Enter second number: ");
							input_two = input8.nextFloat(); 
							System.out.println("result " + Calculator.Division(input_one, input_two)); 
							stack_answers_division.push(Calculator.Division(input_one, input_two)); 
							again_calculator = true; 
							break; 
						case "F": 
							System.out.println("Enter first number: ");
							input_one = input9.nextFloat(); 
							System.out.println("Enter second number: ");
							input_two = input10.nextFloat(); 
							System.out.println("result " + Calculator.Modular(input_one, input_two));
							stack_answers_modular.push(Calculator.Modular(input_one, input_two)); 
							again_calculator = true; 
							break; 
						case "G": 
							System.out.println("Enter a number: ");
							input_one = input11.nextFloat(); 
							System.out.println("result " + Calculator.Square_Root(input_one));
							stack_answers_squareRoot.push(Calculator.Square_Root(input_one)); 
							again_calculator = true; 
							break; 
						case "H": 
							System.out.println("Enter a number: ");
							int_input_one = input12.nextInt();
							System.out.println("Enter to the power what number: ");
							int_input_two = input13.nextInt(); 
							System.out.println("result " + Calculator.Power_number(int_input_one, int_input_two));
							stack_answers_powerNumber.push(Calculator.Power_number(int_input_one, int_input_two)); 
							again_calculator = true; 
							break; 
						case "I": 
							System.out.println("Enter a number: "); 
							int_input_one = input14.nextInt(); 
							System.out.println("Enter another number");
							int_input_two = input15.nextInt(); 
							System.out.println("Greatest Common Divisor is " + Calculator.GCD(int_input_one, int_input_two));
							stack_answers_GCD.push(Calculator.GCD(int_input_one, int_input_two)); 
							again_calculator = true; 
							break; 
						case "J": 
							System.out.println("Enter Opposite: ");
							input_one = input16.nextFloat(); 
							System.out.println("Enter Adjacent: ");
							input_two = input17.nextFloat(); 
							System.out.println("Hypotenuse result: " + Calculator.Pythagorean(input_one, input_two));
							stack_answers_pythagoreanTheorem.push(Calculator.Pythagorean(input_one, input_two)); 
							again_calculator = true; 
							break; 
						case "ANSWERS": 
							  stack_answers_history(); 
						      again_calculator = true; 
						      break; 
						default:
							System.out.println("*please enter valid options*");
							again_calculator = true; 
							break;
				  }	
			        	  	
			    }
			    System.out.println("Thanks for coming..."); 
			}  
	
	public static void stack_answers_history() {
		  System.out.println("--------answers history----------");
		  System.out.println("Addition answers: " + stack_answers_addition);
	      System.out.println("Subtraction answers: " + stack_answers_subtraction);
	      System.out.println("Multiplication answers: " + stack_answers_multiplication);
	      System.out.println("Division answers: " + stack_answers_division);
	      System.out.println("Modular answers: " + stack_answers_modular);
	      System.out.println("Square Root anwsers: " + stack_answers_squareRoot);
	      System.out.println("Power Number answers: " +  stack_answers_powerNumber);
	      System.out.println("GCD answers: " + stack_answers_GCD);
	      System.out.println("Pythagorean theorem answers" + stack_answers_pythagoreanTheorem);
	      System.out.println();
	}
}
