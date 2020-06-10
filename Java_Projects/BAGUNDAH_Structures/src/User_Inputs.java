import java.util.HashMap; 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList; 

public class User_Inputs {
	
	public static HashMap<Integer, String> list_bugs = new HashMap<Integer, String>(); 
	public static ArrayList<String> chosen_bugs = new ArrayList<String>(); 
	
	public static String[][] getBoard; 
	public static int getRows; 
	public static int getCols; 
	 
	
	private static Scanner input_1 = new Scanner(System.in);
	private static Scanner input_2 = new Scanner(System.in); 
	private static Scanner input_3 = new Scanner(System.in); 
	private static Scanner input_4 = new Scanner(System.in); 
	private static Scanner input_5 = new Scanner(System.in); 
	private static Scanner input_6 = new Scanner(System.in); 
	private static Scanner input_7 = new Scanner(System.in); 
	private static Scanner input_8 = new Scanner(System.in); 
	private static Scanner input_9 = new Scanner(System.in); 
	private static Scanner input_10 = new Scanner(System.in); 
	private static Scanner input_11 = new Scanner(System.in); 
    
    private static int choose_option_menu;  
    private static int choose_option_viewbugs; 
    private static int choose_option_choosebugs; 
    private static int choose_option_choosebugs2; 
    private static int choose_gridSize; 
    
    private static boolean try_again = true;
    private static int back_option;
    
    private static String bug1_enterRow; 
    private static int bug1_enterCol; 
    private static String bug2_enterRow; 
    private static int bug2_enterCol; 
    
    private static int inputSettings; 
    
    public static int numberTurns = 0; 
    
    public static boolean GameOver = false; 
    
	
	public static void Inputs() {
		
		menu(); 
			
	}
	
	
	public static void menu() {
	    
		while (try_again) {
				   Display.menu();
				   choose_option_menu = input_1.nextInt();
				   
				   
					if (choose_option_menu == 1) {
						menu_2(); 
						try_again = false; 
					}
					else if (choose_option_menu == 2) {
						want_choose(); 
						try_again = false; 
					}
					else if (choose_option_menu == 3) {
						settingsOption(); 
						try_again = false; 
					}
					else {
						System.err.println("*Please select an existing option*");
						try_again = true;  
					}
			 
	   }
	}
	
	public static void settingsOption() {
		while (try_again) {
			Display.displaySettings(); 
			inputSettings = input_11.nextInt(); 
			if (inputSettings == 0) {
				menu(); 
				try_again = false; 
			}
			else if (inputSettings == 1) {
				Board_System.setHideTarget = true; 
				menu(); 
				try_again = false;
			}
			else if (inputSettings == 2) {
				Board_System.setHideTarget = false; 
				menu(); 
				try_again = false; 
			}
			else {
				System.err.println("Please select an existing option.");
				try_again = true; 
			}
		}
	}


	
	public static void menu_2() {
		while (try_again) {
			Display.view_bugs(); 
			choose_option_viewbugs = input_2.nextInt();
			if (choose_option_viewbugs == 0) {
				menu(); 
				try_again = false; 
			}
			else if (choose_option_viewbugs == 1) {
				boolean try_again_view1 = true; 
				while (try_again_view1) {
					Display.view_Bugla(); 
					back_option = input_3.nextInt(); 
					if (back_option == 0) {
						menu_2(); 
					}
					else {
						System.err.println("*Please select an existing option*");
						try_again_view1 = true;  
					}
				}
				 
			}
			else if (choose_option_viewbugs == 2) {
				boolean try_again_view2 = true;  
				while (try_again_view2) {
					Display.view_Spida(); 
					back_option = input_3.nextInt(); 
					if (back_option == 0) {
						menu_2(); 
					}
					else {
						System.err.println("*Please select an existing option*");
						try_again_view2 = true; 
					}
				}
				 
			}
			else if (choose_option_viewbugs == 3) {
				boolean try_again_view3 = true; 
				while (try_again_view3) {
					Display.view_Wormak(); 
					back_option = input_3.nextInt(); 
					if (back_option == 0) {
						menu_2();  
					}
					else {
						System.err.println("*Please select an existing option*");
						try_again_view3 = true; 
					}
				}
				
			}
			else if (choose_option_viewbugs == 4) {
				boolean try_again_view4 = true;  
				while (try_again_view4) {
					Display.view_Criketo(); 
					back_option = input_3.nextInt(); 
					if (back_option == 0) {
						menu_2();
					}
					else {
						System.err.println("*Please select an existing option*");
						try_again_view4 = true; 
					}
				}
				
			}
			else if (choose_option_viewbugs == 5) {
				boolean try_again_view5 = true; 
				while (try_again_view5) {
					Display.view_Camoscorp(); 
					back_option = input_3.nextInt(); 
					if (back_option == 0) {
						menu_2(); 
					}
					else {
						System.err.println("*Please select an existing option*");
						try_again_view5 = true; 
					}
				}
			}
			else if (choose_option_viewbugs == 6) {
				boolean try_again_view6 = true; 
				while (try_again_view6) {
					Display.view_Blackishbarkung(); 
					back_option = input_3.nextInt(); 
					if (back_option == 0) {
						menu_2();
					}
					else {
						System.err.println("*Please select an existing option*");
						try_again_view6 = true; 
					}
				}
			}
			else {
				System.err.println("*Please select an existing option*");
				try_again = true; 
			}
		}	
	}
	
	
	public static void want_choose() {
		
		
		list_bugs.put(1, "Bugla"); 
		list_bugs.put(2, "Spida"); 
		list_bugs.put(3, "Wormak"); 
		list_bugs.put(4, "Criketo"); 
		list_bugs.put(5, "Camoscorp"); 
		list_bugs.put(6, "Blackishbarkung"); 
		
		
		while (try_again) {
			Display.choose_bugs(); 
			System.out.println("choose your first bug: ");
			choose_option_choosebugs = input_4.nextInt(); 
			if (choose_option_choosebugs == 0) {
				menu(); 
				try_again = false; 
			}
			System.out.println("choose your second bug: ");
			choose_option_choosebugs2 = input_5.nextInt(); 
			
		
		    if (choose_option_choosebugs == 1 && choose_option_choosebugs2 == 2 || choose_option_choosebugs == 1 && choose_option_choosebugs2 == 3 || choose_option_choosebugs == 1 && choose_option_choosebugs2 == 4 || choose_option_choosebugs == 1 && choose_option_choosebugs2 == 5 || choose_option_choosebugs == 1 && choose_option_choosebugs2 == 6) {
				System.out.println("You chose: " + list_bugs.get(choose_option_choosebugs) + " and " + list_bugs.get(choose_option_choosebugs2));
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs)); 
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs2)); 
				selectGridSize(); 
				try_again = false; 
			}
			else if (choose_option_choosebugs == 2 && choose_option_choosebugs2 == 1 || choose_option_choosebugs == 2 && choose_option_choosebugs2 == 3 || choose_option_choosebugs == 2 && choose_option_choosebugs2 == 4 || choose_option_choosebugs == 2 && choose_option_choosebugs2 == 5 || choose_option_choosebugs == 2 && choose_option_choosebugs2 == 6) {
				System.out.println("You chose: " + list_bugs.get(choose_option_choosebugs) + " and " + list_bugs.get(choose_option_choosebugs2));
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs)); 
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs2)); 
				selectGridSize(); 
				try_again = false; 
			}
			else if (choose_option_choosebugs == 3 && choose_option_choosebugs2 == 1 || choose_option_choosebugs == 3 && choose_option_choosebugs2 == 2 || choose_option_choosebugs == 3 && choose_option_choosebugs2 == 4 || choose_option_choosebugs == 3 && choose_option_choosebugs2 == 5 || choose_option_choosebugs == 3 && choose_option_choosebugs2 == 6) {
				System.out.println("You chose: " + list_bugs.get(choose_option_choosebugs) + " and " + list_bugs.get(choose_option_choosebugs2));
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs)); 
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs2)); 
				selectGridSize(); 
				try_again = false; 
			}
			else if (choose_option_choosebugs == 4 && choose_option_choosebugs2 == 1 || choose_option_choosebugs == 4 && choose_option_choosebugs2 == 2 || choose_option_choosebugs == 4 && choose_option_choosebugs2 == 3 || choose_option_choosebugs == 4 && choose_option_choosebugs2 == 5 || choose_option_choosebugs == 4 && choose_option_choosebugs2 == 6) {
				System.out.println("You chose: " + list_bugs.get(choose_option_choosebugs) + " and " + list_bugs.get(choose_option_choosebugs2));
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs)); 
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs2)); 
				selectGridSize(); 
				try_again = false; 
			}
			else if (choose_option_choosebugs == 5 && choose_option_choosebugs2 == 1 || choose_option_choosebugs == 5 && choose_option_choosebugs2 == 2 || choose_option_choosebugs == 5 && choose_option_choosebugs2 == 3 || choose_option_choosebugs == 5 && choose_option_choosebugs2 == 4 || choose_option_choosebugs == 5 && choose_option_choosebugs2 == 6) {
				System.out.println("You chose: " + list_bugs.get(choose_option_choosebugs) + " and " + list_bugs.get(choose_option_choosebugs2));
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs)); 
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs2)); 
				selectGridSize(); 
				try_again = false; 
			}
			else if (choose_option_choosebugs == 6 && choose_option_choosebugs2 == 1 || choose_option_choosebugs == 6 && choose_option_choosebugs2 == 2 || choose_option_choosebugs == 6 && choose_option_choosebugs2 == 3 || choose_option_choosebugs == 6 && choose_option_choosebugs2 == 4 || choose_option_choosebugs == 6 && choose_option_choosebugs2 == 5) {
				System.out.println("You chose: " + list_bugs.get(choose_option_choosebugs) + " and " + list_bugs.get(choose_option_choosebugs2));
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs)); 
				chosen_bugs.add(list_bugs.get(choose_option_choosebugs2)); 
				selectGridSize(); 
				try_again = false; 
			}
			else {
				System.err.println("*Please select an existing option*");
				try_again = true; 
			}
		}
				
	}
	
	public static void selectGridSize() {
		while (try_again) {
			Display.displayGridSize(); 
			choose_gridSize = input_6.nextInt();
			if (choose_gridSize == 1) {
				int rows = 6; 
				int cols = 12; 
                Board_System.rows = rows; 
                Board_System.cols = cols; 
                Board_System.choose_board(1);
                getBoard = Display.matrix_1; 
                getRows = rows; 
                getCols = cols; 
				startGame(); 
				try_again = false; 
			}
			else if (choose_gridSize == 2) {
				int rows = 12; 
				int cols = 18; 
				Board_System.rows = rows; 
				Board_System.cols = cols; 
				Board_System.choose_board(2); 
				getBoard = Display.matrix_2; 
                getRows = rows; 
                getCols = cols;
				startGame(); 
				try_again = false; 
			}
			else if (choose_gridSize == 3) {
				int rows = 18; 
				int cols = 24; 
				Board_System.rows = 18; 
				Board_System.cols = 24; 
				Board_System.choose_board(3);
				getBoard = Display.matrix_3; 
                getRows = rows; 
                getCols = cols;
				startGame(); 
				try_again = false; 
			}
			else {
				System.err.println("*Please select an existing option*");
				try_again = true; 
			}
		}	
	}
	
	public static String getPlayer1() {
		return chosen_bugs.get(0); 
	}
	public static String getPlayer2() {
		return chosen_bugs.get(1); 
	}
	
	public static String[][] getBoard() {
		return getBoard; 
	}
	
	public static int getRows() {
		return getRows; 
	}
	
	public static int getCols() {
		return getCols; 
	}
	
	
	
	public static void startGame() {
		
		while (!GameOver) { 
			player1(); 
			player2(); 
		}

	}
	
	public static void player1() {
		boolean again_play = true; 
		
		while (again_play) {
			try {
				System.out.println("Settings: rows for 'abab' and cols for 1010"); 
				System.out.println("# Turns: " + numberTurns);  
				System.out.println(getPlayer1() + " is turn! (A)");
				Display.enterRow(); 
				bug1_enterRow = input_7.nextLine(); 
				Display.enterCol(); 
				bug1_enterCol = input_8.nextInt(); 	
				
				
				Board_System.playBoard(getBoard(), bug1_enterRow.toUpperCase(), bug1_enterCol, "A ", getPlayer1());
	        	Board_System.populateBoard(getBoard(), getRows(), getCols(), GameOver);
				again_play = false; 
			}
			catch (ArrayIndexOutOfBoundsException exception) {
				System.err.print("OUT OF BOUNDS");
				again_play = true; 
				
			}
		}
		
	}
	

	public static void player2() {
		boolean again_play = true;
		
		while (again_play) {
			try {
				System.out.println("Settings: rows for 'abab' and cols for 1010"); 
				System.out.println("# Turns: " + numberTurns);  
				System.out.println(getPlayer2() + " is turn! (B)"); 
				Display.enterRow(); 
				bug2_enterRow = input_9.nextLine(); 
				Display.enterCol(); 
				bug2_enterCol = input_10.nextInt(); 
				
				
				Board_System.playBoard(getBoard(), bug2_enterRow.toUpperCase(), bug2_enterCol, "B ", getPlayer2());
				
				Board_System.populateBoard(getBoard(), getRows(), getCols(), GameOver);
				again_play = false; 
			} 
			catch(ArrayIndexOutOfBoundsException exception) {
				System.err.println("OUT OF BOUNDS");
				again_play = true; 
			}
		}
	}
	
	



	
	
	
	//These methods are only use for spot taken. 
	/*
	@Overloading 
	public static void player1(boolean redoInput) {
		System.out.println(chosen_bugs.get(0) + " is turn! (A)");
		Display.enterRow(); 
		bug1_enterRow = input_7.nextLine(); 
		Display.enterCol(); 
		bug1_enterCol = input_8.nextInt(); 
		Board_System.playBoard(getBoard(), bug1_enterRow, bug1_enterCol, "A "); 
		
		Board_System.populateBoard(getBoard(), getRows(), getCols());
		
		if (redoInput) {
			System.out.println(chosen_bugs.get(0) + " is turn! (A)");
			Display.enterRow(); 
			bug1_enterRow = input_7.nextLine(); 
			Display.enterCol(); 
			bug1_enterCol = input_8.nextInt(); 
			
			Board_System.combineSpot = bug1_enterRow.concat(String.valueOf(bug1_enterCol)); 
			
			Board_System.storeSpots.add(Board_System.storeSpots.size() - 1, Board_System.combineSpot); 
			
			Board_System.playBoard(getBoard(), bug1_enterRow, bug1_enterCol, "A ");
		}
		
	}
	
	@Overloading
	public static void player2(boolean redoInput) {
		System.out.println(chosen_bugs.get(1) + " is turn! (B)"); 
		Display.enterRow(); 
		bug2_enterRow = input_9.nextLine(); 
		Display.enterCol(); 
		bug2_enterCol = input_10.nextInt(); 
		Board_System.playBoard(getBoard(), bug2_enterRow, bug2_enterCol, "B ");
		
		Board_System.populateBoard(getBoard(), getRows(), getCols());
	}
	*/
	

		
}

