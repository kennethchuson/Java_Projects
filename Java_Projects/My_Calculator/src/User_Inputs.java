
import java.util.Scanner;


public class User_Inputs {
	
	
	/* 
	 We do not need to share these inputs for the other classes, these inputs provides each choices 
	 from the calculator features. 
	 */
	private static String select_option; 
	private static String name; 
	private static float input_one; 
	private static float input_two; 
	private static int int_input_one; 
	private static int int_input_two; 
	
	//loop through again if a user wanted to go back again to the menu option. 
	private static boolean again_calculator = true; 
	
	private static Scanner inputName, input, input1, input2, input3, input4, input5, input6, input7, input8, input9, input10, input11, input12, input13; 

	

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
		
		System.out.println("WELCOME TO MY CALCUATOR");
		
		//Simple Introduce 
	    System.out.println("Please enter your name: ");
	    name = inputName.nextLine();
	    
	    //Input validation 
	    while (!name.matches("[a-zA-Z ,]+")) {
	        System.err.println("WARNING: Should be letters not numbers or symbols");
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
			        	System.err.println("WARNING: Should be uppercase letter not numbers");
			        	select_option = input.nextLine(); 
			        }
			       
			        //call those functions for the selecting inputs from the calculator.
			        if (select_option.equals("A") || select_option.equals("a")) {
			        	System.out.println("Thanks for coming");
			        	again_calculator = false; 
			        }
			        else if (select_option.equals("B") || select_option.equals("b")) {
			        	selection_Inputs("B"); 
						again_calculator = true; 
			        }
			        else if (select_option.equals("C") || select_option.equals("c")) {
			        	selection_Inputs("C"); 
						again_calculator = true; 
			        }
			        else if (select_option.equals("D") || select_option.equals("d")) {
			        	selection_Inputs("D"); 
						again_calculator = true;
			        }
			        else if (select_option.equals("E") || select_option.equals("e")) {
			        	selection_Inputs("E"); 
						again_calculator = true; 
			        }
			        else if (select_option.equals("F") || select_option.equals("f")) {
			        	selection_Inputs("F"); 
						again_calculator = true; 
			        }
			        else if (select_option.equals("G") || select_option.equals("g")) {
			        	selection_Inputs("G"); 
						again_calculator = true; 
			        }
			        else if (select_option.equals("H") || select_option.equals("h")) {
			        	selection_Inputs("H"); 
						again_calculator = true; 
			        }
			        else if (select_option.equals("I") || select_option.equals("i")) {
			        	selection_Inputs("I"); 
						again_calculator = true; 
			        }
			        else if (select_option.equals("J") || select_option.equals("j")) {
			        	selection_Inputs("J"); 
						again_calculator = true;
			        }
			        else if (select_option.equals("ANSWERS") || select_option.equals("answers")) {
			        	selection_Inputs("ANSWERS"); 
					    again_calculator = true; 

			        }
			        else {
			        	System.err.println("*please enter valid options*");
						again_calculator = true; 
			        }
			}
	}
	
	//User selection inputs.
	public static void selection_Inputs(String choice) { 
		
		if (choice.equals("B")) {
			boolean repeat_question_addition = true; 
			while (repeat_question_addition) {
				System.out.println("How many numbers?");
				input_one = input1.nextFloat(); 
				if (input_one <= 1) {
					System.err.println("Should be more than one."); 
					repeat_question_addition = true; 
				}
				else {
					System.out.println("result " + Calculator.addition(input_one));
					repeat_question_addition = false; 
				}
			}
		}
		if (choice.equals("C")) {
			boolean repeat_question_subtraction = true; 
			while (repeat_question_subtraction) {
				System.out.println("How many numbers?");
				input_one = input2.nextFloat();
				if (input_one <= 1) {
					System.err.println("Should be more than one."); 
					repeat_question_subtraction = true; 
				}
				else {
					System.out.println("result " + Calculator.subtraction(input_one));
					repeat_question_subtraction = false; 
				}
			}				
		}
		if (choice.equals("D")) {
			boolean repeat_question_multiplication = true; 
			while (repeat_question_multiplication) {
				System.out.println("How many numbers?");
				input_one = input3.nextFloat(); 
				if (input_one <= 1) {
					System.err.println("Should be more than one."); 
					repeat_question_multiplication = true; 
				}
				else {
					System.out.println("result " + Calculator.multiplication(input_one));
					repeat_question_multiplication = false; 
				}
			}
		}
		if (choice.equals("E")) {
			boolean repeat_question_division = true; 
			while (repeat_question_division) {
				System.out.println("How many numbers?");
				input_one = input4.nextFloat(); 
				if (input_one <= 1) {
					System.err.println("Should be more than one");
					repeat_question_division = true; 
				}
				else {
					System.out.println("result " + Calculator.Division(input_one));
					repeat_question_division = false; 
				}
			}
			
		}
		if (choice.equals("F")) {
			System.out.println("Enter a number: ");
			input_one = input5.nextFloat(); 
			System.out.println("Enter another number: ");
			input_two = input6.nextFloat();  
			System.out.println("result " + Calculator.Modular(input_one, input_two));
		}
		if (choice.equals("G")) {
			System.out.println("Enter a number: ");
			input_one = input7.nextFloat(); 
			System.out.println("Enter a power number"); 
			input_two = input8.nextFloat(); 
			System.out.println("result " + Calculator.Power_number(input_one, input_two));
		}
		if (choice.equals("H")) {
			System.out.println("Enter a number: ");
			input_one = input9.nextFloat(); 
			System.out.println("result " + Calculator.Square_Root(input_one));
		}
		if (choice.equals("I")) {
			System.out.println("Enter a number: "); 
			int_input_one = input10.nextInt(); 
			System.out.println("Enter another number");
			int_input_two = input11.nextInt(); 
			System.out.println("Greatest Common Divisor is " + Calculator.GCD(int_input_one, int_input_two));
		}
		if (choice.equals("J")) {
			System.out.println("Enter Opposite: ");
			input_one = input12.nextFloat(); 
			System.out.println("Enter Adjacent: ");
			input_two = input13.nextFloat(); 
			System.out.println("Hypotenuse result: " + Calculator.Pythagorean(input_one, input_two));
		}
		if (choice.equals("ANSWERS")) {
			Data_Answers.answers_history(); 
		}
	}
	
	
	
	
}
