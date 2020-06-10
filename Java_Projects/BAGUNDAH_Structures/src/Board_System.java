import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Board_System {
	
	private static HashMap<String, Integer> enterRows = new HashMap<String, Integer>(); 
	public static List<String> storeSpots= new ArrayList<String>(); 

	
	public static int rows; 
	public static int cols; 
	
	private static char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	//Spots
	public static String getRowsSpot; 
	public static String getColsSpot; 
	public static String combineSpot; 
	public static Object[] combineSpotsList; 
	
	//settings 
	public static boolean setHideTarget = false; 
	private static String labelHide = ". "; 
	private static String labelTarget = "◎ "; 
	
	 
	
	public static void choose_board(int choose) {
		switch (choose) {
			case 1: 			
				populateBoard(Display.matrix_1, rows, cols, User_Inputs.GameOver);
				break; 
			case 2: 
				 populateBoard(Display.matrix_2, rows, cols, User_Inputs.GameOver); 
				break; 
			case 3: 		
				 populateBoard(Display.matrix_3, rows, cols, User_Inputs.GameOver); 

				break; 
			
		}
	}
	
	
	public static void populateBoard(String board[][], int rowsInPlace, int colsInPlace, boolean gameOver) {
			
		
		for (int printAlphabet = 0; printAlphabet < colsInPlace; printAlphabet++) {
			System.out.print(alphabet[printAlphabet] + " ");
		} 
		System.out.println(); 
		for (int borderAlphabet = 0; borderAlphabet < colsInPlace; borderAlphabet++) {
			System.out.print("-" + " ");
		}
		System.out.println(); 
		
		
		
			for (int height = 0; height < board.length; height++) {
				for (int width = 0; width < board[height].length; width++) {
					if (gameOver) {
					   System.out.print(board[height][width] = "X ");
					}
					else {
						System.out.print(board[height][width]); 
					}
				}
				System.out.println(" |" + height);
			}
		
	}
	
	
	
	
	public static void playBoard(String board[][], String choose_rows, int choose_cols, String labelPlayer, String chosePlayer) {
		
		
		User_Inputs.numberTurns++; 
		
		
		String convertString; 
		int counterNumberSelection = 0; 
		for (char iterateAlphabet = 'A'; iterateAlphabet <= 'Z'; iterateAlphabet++) {
			convertString = String.valueOf(iterateAlphabet);
			enterRows.put(convertString, counterNumberSelection++); 
		}
		
	
		board[choose_cols][enterRows.get(choose_rows)] = labelPlayer; 
		
		if (User_Inputs.getRows() == 6 && User_Inputs.getCols() == 12) {
			if (choose_cols == 0 && choose_rows.equals("A")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 1); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 1); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 1); 
				}
			}
			else if (choose_cols == 5 && choose_rows.equals("A")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 2); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 2); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 2); 
				}
				
			}
			else if (choose_cols == 0 && choose_rows.equals("L")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 3); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 3); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 3); 
				}
			}
			else if (choose_cols == 5 && choose_rows.equals("L")) {
					if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 4); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 4); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 4); 
				}
				
			}
			//Middle Bounds (6 * 12)
			else if ((choose_cols == 0 && choose_rows.equals("B")) || 
					(choose_cols == 0 && choose_rows.equals("C")) || 
					(choose_cols == 0 && choose_rows.equals("D")) ||
					(choose_cols == 0 && choose_rows.equals("E")) ||
					(choose_cols == 0 && choose_rows.equals("F")) || 
					(choose_cols == 0 && choose_rows.equals("G")) || 
					(choose_cols == 0 && choose_rows.equals("H")) || 
					(choose_cols == 0 && choose_rows.equals("I")) ||
					(choose_cols == 0 && choose_rows.equals("J")) ||
					(choose_cols == 0 && choose_rows.equals("K"))) 
			{
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
				    middleBound_Walkable(board, choose_cols, choose_rows, "UP"); 
				} 
				else if (chosePlayer.equals("Spida")) {
				    middleBound_Jumpable(board, choose_cols, choose_rows, "UP"); 

				}
			}
			else if ((choose_cols == 1 && choose_rows.equals("A")) || 
					(choose_cols == 2 && choose_rows.equals("A")) || 
					(choose_cols == 3 && choose_rows.equals("A")) ||
					(choose_cols == 4 && choose_rows.equals("A"))) 
			{
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
				    middleBound_Walkable(board, choose_cols, choose_rows, "LEFT"); 
				}
				else if (chosePlayer.equals("Spida")) {
				    middleBound_Jumpable(board, choose_cols, choose_rows, "LEFT"); 

				}
			}
			else if ((choose_cols == 5 && choose_rows.equals("B")) || 
					(choose_cols == 5 && choose_rows.equals("C")) ||
					(choose_cols == 5 && choose_rows.equals("D")) ||
					(choose_cols == 5 && choose_rows.equals("E")) ||
					(choose_cols == 5 && choose_rows.equals("F")) || 
					(choose_cols == 5 && choose_rows.equals("G")) || 
					(choose_cols == 5 && choose_rows.equals("H")) || 
					(choose_cols == 5 && choose_rows.equals("I")) ||
					(choose_cols == 5 && choose_rows.equals("J")) ||
					(choose_cols == 5 && choose_rows.equals("K"))) 
			{
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
				    middleBound_Walkable(board, choose_cols, choose_rows, "DOWN"); 
				}
				else if (chosePlayer.equals("Spida")) {
				    middleBound_Jumpable(board, choose_cols, choose_rows, "DOWN"); 

				}
			}
			else if ((choose_cols == 1 && choose_rows.equals("L")) || 
					(choose_cols == 2 && choose_rows.equals("L")) || 
					(choose_cols == 3 && choose_rows.equals("L")) ||
					(choose_cols == 4 && choose_rows.equals("L"))) 
			{
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
				    middleBound_Walkable(board, choose_cols, choose_rows, "RIGHT"); 
				} 
				else if (chosePlayer.equals("Spida")) {
				    middleBound_Jumpable(board, choose_cols, choose_rows, "RIGHT"); 

				}
			}
			
			else {
				noTouchBoundsTargets(board, choose_rows, choose_cols, chosePlayer); 
			}
		}
		else if (User_Inputs.getRows() == 12 && User_Inputs.getCols() == 18) {
			if (choose_cols == 0 && choose_rows.equals("A")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 1); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 1); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 1); 
				}
			}
			else if (choose_cols == 12 && choose_rows.equals("A")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 2); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 2); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 2); 
				}
				
			}
			else if (choose_cols == 0 && choose_rows.equals("R")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 3); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 3); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 3); 
				}
			}
			else if (choose_cols == 12 && choose_rows.equals("R")) {
					if (chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 4); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 4); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 4); 
				}
				
			}
			else {
				noTouchBoundsTargets(board, choose_rows, choose_cols, chosePlayer); 
			}
		}
		else if (User_Inputs.getRows() == 18 && User_Inputs.getCols() == 24) {
			if (choose_cols == 0 && choose_rows.equals("A")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 1); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 1); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 1); 
				}
			}
			else if (choose_cols == 18 && choose_rows.equals("A")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 2); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 2); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 2); 
				}
				
			}
			else if (choose_cols == 0 && choose_rows.equals("X")) {
				if (chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 3); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 3); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 3); 
				}
			}
			else if (choose_cols == 18 && choose_rows.equals("X")) {
					if (chosePlayer.equals("Bugla") || chosePlayer.equals("Wormak") || chosePlayer.equals("Camoscorp") || chosePlayer.equals("Blackishbarkung")) {
					movePossibleBound_Walkable(board, choose_cols, choose_rows, 4); 
				}
				else if (chosePlayer.equals("Spida")) {
					movePossibleBound_Jumpable(board, choose_cols, choose_rows, 4); 
				}
				else if (chosePlayer.equals("Criketo")) {
					movePossibleBound_Flyable(board, choose_cols, choose_rows, 4); 
				}
				
			}
			else {
				noTouchBoundsTargets(board, choose_rows, choose_cols, chosePlayer); 
			}
		}
		else {
			
		}
		
		
	
		
		
		/*
	    getRowsSpot = choose_rows; 
	    getColsSpot = String.valueOf(choose_cols); 
		
	    combineSpot = getRowsSpot.concat(getColsSpot); 
		
		storeSpots.add(combineSpot); 
		
	    combineSpotsList = storeSpots.toArray(); 
	    
		boolean check_taken_spot = true;  
		while (check_taken_spot) {
			if (checkSpotTaken(combineSpotsList)) {
				System.err.println("This spot is already taken");
				switch (labelPlayer) {
					case "A ": 
						User_Inputs.player1(true);
						check_taken_spot = false; 
						break; 
					case "B ": 
						User_Inputs.player2(true); 
						check_taken_spot = false; 
						break; 
				}
				check_taken_spot = true; 
			}
			else {
				board[choose_cols][enterRows.get(choose_rows)] = labelPlayer; 
				
				if (chosePlayer == "Bugla") {
					movePossible_Walkable(board, choose_rows, choose_cols);
				}
				else if (chosePlayer == "Spida") {
					movePossible_Jumpable(board, choose_rows, choose_cols); 
				}
				else if (chosePlayer == "Wormak") {
					movePossible_Walkable(board, choose_rows, choose_cols); 
				}
				else if (chosePlayer == "Criketo") {
					movePossible_Flyable(board, choose_rows, choose_cols); 
				}
				else if (chosePlayer == "Camoscorp") {
					movePossible_Walkable(board, choose_rows, choose_cols); 
				}
				else if (chosePlayer == "Blackishbarkung") {
					movePossible_Walkable(board, choose_rows, choose_cols); 

				}
				check_taken_spot = false; 
			}
		}
		*/
	}
	
	
	
	private static <T> boolean checkSpotTaken(T... passListSpots) {
		Set<T> set = new HashSet<T>();

		for (T iterateSpots : passListSpots)
		{
			if (set.contains(iterateSpots)) {
				return true; 
			}
			if (iterateSpots != null) {
				set.add(iterateSpots);
			}
		}
		return false;
	}
	
	public static void noTouchBoundsTargets(String [][]board, String choose_rows, int choose_cols, String chosePlayer) {
		if (chosePlayer.equals("Bugla")) {
			movePossible_Walkable(board, choose_rows, choose_cols);
		}
		else if (chosePlayer.equals("Spida")) {
			movePossible_Jumpable(board, choose_rows, choose_cols); 
		}
		else if (chosePlayer.equals("Wormak")) {
			movePossible_Walkable(board, choose_rows, choose_cols); 
		}
		else if (chosePlayer.equals("Criketo")) {
			movePossible_Flyable(board, choose_rows, choose_cols); 
		}
		else if (chosePlayer.equals("Camoscorp")) {
			movePossible_Walkable(board, choose_rows, choose_cols); 
		}
		else if (chosePlayer.equals("Blackishbarkung")) {
			movePossible_Walkable(board, choose_rows, choose_cols); 
		}
	}
	
	public static void movePossible_Walkable(String[][] board, String choose_rows, int choose_cols) {
		String target1, target2, target3, target4; 
		
		if (setHideTarget) {
			target1 = board[choose_cols - 1][enterRows.get(choose_rows)] = labelHide; 
			target2 = board[choose_cols][enterRows.get(choose_rows) + 1] = labelHide; 
			target3 = board[choose_cols + 1][enterRows.get(choose_rows)] = labelHide; 
		    target4 = board[choose_cols][enterRows.get(choose_rows) - 1] = labelHide; 
		}
		else {
			target1 = board[choose_cols - 1][enterRows.get(choose_rows)] = labelTarget; 
			target2 = board[choose_cols][enterRows.get(choose_rows) + 1] = labelTarget; 
			target3 = board[choose_cols + 1][enterRows.get(choose_rows)] = labelTarget; 
			target4 = board[choose_cols][enterRows.get(choose_rows) - 1] = labelTarget; 
		}
		
	}
	
	public static void movePossible_Jumpable(String[][] board, String choose_rows, int choose_cols) {
		String target1, target2, target3, target4; 
		
		if (setHideTarget) {
			target1 = board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelHide; 
			target2 = board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelHide; 
			target3 = board[choose_cols - 1][enterRows.get(choose_rows) - 1] = labelHide; 
			target4 = board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelHide; 
			
		}
		else {
			target1 = board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelTarget; 
			target2 = board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelTarget; 
			target3 = board[choose_cols - 1][enterRows.get(choose_rows) - 1] = labelTarget; 
		    target4 = board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelTarget; 
		}
		
	}
	
	public static void movePossible_Flyable(String[][] board, String choose_rows, int choose_cols) {
		String target1, target2, target3, target4, target5, target6; 
		
		if (setHideTarget) {
			target1 = board[choose_cols - 2][enterRows.get(choose_rows)] = labelHide; 
			target2 = board[choose_cols + 1][enterRows.get(choose_rows) - 2] = labelHide; 
			target3 = board[choose_cols + 2][enterRows.get(choose_rows)] = labelHide; 
			target4 = board[choose_cols + 1][enterRows.get(choose_rows) + 2] = labelHide;
			target5 = board[choose_cols - 1][enterRows.get(choose_rows) - 2] = labelHide; 
		    target6 = board[choose_cols - 1][enterRows.get(choose_rows) + 2] = labelHide; 
		}
		else {
			target1 = board[choose_cols - 2][enterRows.get(choose_rows)] = labelTarget; 
			target2 = board[choose_cols + 1][enterRows.get(choose_rows) - 2] = labelTarget; 
			target3 = board[choose_cols + 2][enterRows.get(choose_rows)] = labelTarget; 
			target4 = board[choose_cols + 1][enterRows.get(choose_rows) + 2] = labelTarget;
			target5 = board[choose_cols - 1][enterRows.get(choose_rows) - 2] = labelTarget; 
			target6 = board[choose_cols - 1][enterRows.get(choose_rows) + 2] = labelTarget; 
		} 
	}
	

	
		
	public static void movePossibleBound_Walkable(String[][] board, int choose_cols, String choose_rows, int switchBound) {
		
		switch(switchBound) {
			case 1: 
				if (setHideTarget) {
					board[choose_cols][enterRows.get(choose_rows) + 1] = labelHide; 
					board[choose_cols + 1][enterRows.get(choose_rows)] = labelHide; 
				} else {
					board[choose_cols][enterRows.get(choose_rows) + 1] = labelTarget; 
					board[choose_cols + 1][enterRows.get(choose_rows)] = labelTarget; 
				}
				break; 
			case 2: 
				if (setHideTarget) {
					board[choose_cols - 1][enterRows.get(choose_rows)] = labelHide; 
					board[choose_cols][enterRows.get(choose_rows) + 1] = labelHide; 
				} else {
					board[choose_cols - 1][enterRows.get(choose_rows)] = labelTarget; 
					board[choose_cols][enterRows.get(choose_rows) + 1] = labelTarget; 
				}
				
				break; 
			case 3: 
				if (setHideTarget) {
					board[choose_cols + 1][enterRows.get(choose_rows)] = labelHide; 
					board[choose_cols][enterRows.get(choose_rows) - 1] = labelHide;
				} else {
					board[choose_cols + 1][enterRows.get(choose_rows)] = labelTarget; 
					board[choose_cols][enterRows.get(choose_rows) - 1] = labelTarget; 
				}
				break; 
			case 4: 
				if (setHideTarget) {
					board[choose_cols - 1][enterRows.get(choose_rows)] = labelHide; 
					board[choose_cols][enterRows.get(choose_rows) - 1] = labelHide; 
				} else {
					board[choose_cols - 1][enterRows.get(choose_rows)] = labelTarget; 
					board[choose_cols][enterRows.get(choose_rows) - 1] = labelTarget; 
				}
				
				break; 
		}
		

	}
	
	public static void movePossibleBound_Jumpable(String[][] board, int choose_cols, String choose_rows, int switchBound) {
		switch(switchBound) {
			case 1: 
				if (setHideTarget) {
					board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelHide; 
				} else {
					board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelTarget; 
				}
				break; 
			case 2: 
				if (setHideTarget) {
					board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelHide; 
				} else {
					board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelTarget; 
				}
				
				break; 
			case 3: 
				if (setHideTarget) {
					board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelHide; 
				} else {
					board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelTarget; 
				}
				break; 
			case 4: 
				if (setHideTarget) {
					board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelHide; 
				} else {
					board[choose_cols - 1][enterRows.get(choose_rows) - 1] = labelTarget; 
				}
				
			break; 
		}
	}
	
	public static void movePossibleBound_Flyable(String[][] board, int choose_cols, String choose_rows, int switchBound) {
		
		switch(switchBound) {
			case 1: 
				if (setHideTarget) {
				    board[choose_cols + 2][enterRows.get(choose_rows)] = labelHide; 
					board[choose_cols + 1][enterRows.get(choose_rows) + 2] = labelHide;
				} else {
					board[choose_cols + 2][enterRows.get(choose_rows)] = labelTarget; 
					board[choose_cols + 1][enterRows.get(choose_rows) + 2] = labelTarget;
				}
				break; 
			case 2: 
				if (setHideTarget) {
					board[choose_cols - 2][enterRows.get(choose_rows)] = labelHide; 
					board[choose_cols - 1][enterRows.get(choose_rows) + 2] = labelHide; 
				} else {
					board[choose_cols - 2][enterRows.get(choose_rows)] = labelTarget; 
					board[choose_cols - 1][enterRows.get(choose_rows) + 2] = labelTarget; 
				}
				
				break; 
			case 3: 
				if (setHideTarget) {
					board[choose_cols + 1][enterRows.get(choose_rows) - 2] = labelHide; 
					board[choose_cols][enterRows.get(choose_rows) + 2] = labelHide;
				} else {
					board[choose_cols + 1][enterRows.get(choose_rows) - 2] = labelTarget; 
					board[choose_cols][enterRows.get(choose_rows) + 2] = labelTarget; 
				}
				break; 
			case 4: 
				if (setHideTarget) {
					board[choose_cols - 2][enterRows.get(choose_rows)] = labelHide; 
					board[choose_cols - 1][enterRows.get(choose_rows) - 2] = labelHide; 
				} else {
					board[choose_cols - 2][enterRows.get(choose_rows)] = labelTarget; 
					board[choose_cols - 1][enterRows.get(choose_rows) - 2] = labelTarget; 
				}
				
				break; 
		}	
	}
	
	public static void middleBound_Walkable(String[][] board, int choose_cols, String choose_rows, String sides) {
		if (sides.equals("UP")) {
			if (setHideTarget) {
				board[choose_cols][enterRows.get(choose_rows) + 1] = labelHide; 
			    board[choose_cols + 1][enterRows.get(choose_rows)] = labelHide; 
				board[choose_cols][enterRows.get(choose_rows) - 1] = labelHide; 
			}
			else {
				board[choose_cols][enterRows.get(choose_rows) + 1] = labelTarget; 
			    board[choose_cols + 1][enterRows.get(choose_rows)] = labelTarget; 
				board[choose_cols][enterRows.get(choose_rows) - 1] = labelTarget; 
			}
		}
		else if (sides.equals("LEFT")) {
			if (setHideTarget) {
				board[choose_cols - 1][enterRows.get(choose_rows)] = labelHide; 
				board[choose_cols][enterRows.get(choose_rows) + 1] = labelHide; 
				board[choose_cols + 1][enterRows.get(choose_rows)] = labelHide; 
			}
			else {
				board[choose_cols - 1][enterRows.get(choose_rows)] = labelTarget; 
				board[choose_cols][enterRows.get(choose_rows) + 1] = labelTarget; 
				board[choose_cols + 1][enterRows.get(choose_rows)] = labelTarget; 
			}
		}
		else if (sides.equals("RIGHT")) {
			if (setHideTarget) {
				board[choose_cols - 1][enterRows.get(choose_rows)] = labelHide; 
				board[choose_cols + 1][enterRows.get(choose_rows)] = labelHide; 
				board[choose_cols][enterRows.get(choose_rows) - 1] = labelHide;
			}
			else {
				board[choose_cols - 1][enterRows.get(choose_rows)] = labelTarget; 
				board[choose_cols + 1][enterRows.get(choose_rows)] = labelTarget; 
				board[choose_cols][enterRows.get(choose_rows) - 1] = labelTarget;
			}
		}
		else if (sides.equals("DOWN")) {
			if (setHideTarget) {
				board[choose_cols - 1][enterRows.get(choose_rows)] = labelHide; 
				board[choose_cols][enterRows.get(choose_rows) + 1] = labelHide; 
				board[choose_cols][enterRows.get(choose_rows) - 1] = labelHide; 
			}
			else {
				board[choose_cols - 1][enterRows.get(choose_rows)] = labelTarget; 
				board[choose_cols][enterRows.get(choose_rows) + 1] = labelTarget; 
				board[choose_cols][enterRows.get(choose_rows) - 1] = labelTarget; 
			}
		}
	}
	
	
	public static void middleBound_Jumpable(String[][] board, int choose_cols, String choose_rows, String sides) {
		if (sides.equals("UP")) {
			if (setHideTarget) {
				board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelHide;  
				board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelHide; 
			}
			else {
				board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelTarget;  
				board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelTarget; 
			}
		}
		else if (sides.equals("LEFT")) {
			if (setHideTarget) {
			   board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelHide; 
			   board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelHide; 
			}
			else {
			   board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelTarget; 
			board[choose_cols + 1][enterRows.get(choose_rows) + 1] = labelTarget; 
			}
		}
		else if (sides.equals("RIGHT")) {
			if (setHideTarget) {
				board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelHide; 
				board[choose_cols - 1][enterRows.get(choose_rows) - 1] = labelHide; 
			}
			else {
				board[choose_cols + 1][enterRows.get(choose_rows) - 1] = labelTarget; 
				board[choose_cols - 1][enterRows.get(choose_rows) - 1] = labelTarget; 
			}
		}
		else if (sides.equals("DOWN")) {
			if (setHideTarget) {
				board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelHide; 
				board[choose_cols - 1][enterRows.get(choose_rows) - 1] = labelHide; 
			}
			else {
				board[choose_cols - 1][enterRows.get(choose_rows) + 1] = labelTarget; 
				board[choose_cols - 1][enterRows.get(choose_rows) - 1] = labelTarget; 
			}
		}
	}
	
	public static void middleBound_Flyable(String[][] board, int choose_cols, String choose_rows, int switchBound) {
		
	}
	
	
	



	

	
	
	

	
 
	
}
