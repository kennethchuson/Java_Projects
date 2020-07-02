
import java.io.File; 

import Knights.BlueKnight;
import Knights.RedKnight; 




public class Main {
	
	
	static class GameCheats {
		static int increaseHealth = 0; 
		static int legalAge = 18; 
		
		
		public static int increaseHealth(int currentHealth) {
			if (currentHealth == 0) {
				increaseHealth = 5; 
				currentHealth = increaseHealth; 
			}
			return currentHealth; 
		}
		
		public static int increaseAge(int currentAge) {
			if (currentAge < 18) {
				currentAge = legalAge; 
			}
			return currentAge; 
		}
	}
	
	private static void play_1() {
		//I want to cheat...
		GameCheats cheating = new GameCheats(); 
		GameCheats.increaseAge(17); 
		
		BlueKnight player_1 = new BlueKnight("Sally", 24, 98, true);
		RedKnight player_2 = new RedKnight("Jordan", GameCheats.increaseAge(17), 94, true); 
		
		

		player_1.fightStrategy(); 
	    player_2.fightStrategy();
	    
	    
	    player_1.setWeaponStrength(10); 
	    player_2.setWeaponStrength(20); 
	    
	    if (player_1.getWeaponStrength() > player_2.getWeaponStrength()) {
	    	System.out.println("player 1 wins");
	    }
	    else if (player_1.getWeaponStrength() < player_2.getWeaponStrength()) {
	    	System.out.println("player 2 wins");
	    }
	    
	    
	    
	   
	    
	}
	
	
	private static void play_2() {
		BlueKnight player_1 = new BlueKnight("Lok", 21, 99, true);
		RedKnight player_2 = new RedKnight("Morgan", 27, 95, true); 
	}
	
	private static void play_3() {
		BlueKnight player_1 = new BlueKnight("Jalen", 20, 98, true);
		RedKnight player_2 = new RedKnight("Josh", 19, 94, true);         
	}
	
	

	public static void main(String[] args) {
		
		Categories c = Categories.KINGDOM_1; 
		
		switch(c) {
			case KINGDOM_1:     
			    play_1(); 
				break; 
			case KINGDOM_2: 
				play_2(); 
				break; 
			case KINGDOM_3: 
				play_3(); 
				break; 
		}
		
		
		
		
		
	}

}
