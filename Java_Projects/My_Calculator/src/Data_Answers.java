import java.util.ArrayList;

/*
 Store all data answers inside the ArrayList for the history answers. 
 */

public class Data_Answers {

    //Creating lists for history answers. (Categories)
	static ArrayList<Float> stack_answers_addition = new ArrayList<Float>();
	static ArrayList<Float> stack_answers_subtraction = new ArrayList<Float>(); 
	static ArrayList<Float> stack_answers_multiplication = new ArrayList<>(); 
	static ArrayList<Float> stack_answers_division = new ArrayList<Float>(); 
	static ArrayList<Float> stack_answers_modular = new ArrayList<Float>(); 
	static ArrayList<Float> stack_answers_squareRoot = new ArrayList<Float>(); 
	static ArrayList<Float> stack_answers_powerNumber = new ArrayList<Float>(); 
	static ArrayList<Float> stack_answers_GCD = new ArrayList<Float>(); 
	static ArrayList<Float> stack_answers_pythagoreanTheorem = new ArrayList<Float>();
	
	//Create a list for history answers. (Combination) 
	static ArrayList<Float> combination = new ArrayList<Float>(); 
	
	
	
	public static void answers_history() {
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
	      System.out.println("-------------------------------------------------------------");
	      System.out.println("Total Answers: " + combination.size()); 
	     // System.out.println("Number of Answers: " + answers_history_features(true)); 
	      System.out.println();
	}




	
	
}
