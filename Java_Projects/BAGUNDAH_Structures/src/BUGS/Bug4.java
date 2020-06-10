package BUGS;

import Abilities.Flyable;
import Abilities.Run_Walk;

public class Bug4 extends Insects implements Run_Walk, Flyable {

    public Bug4(String name, int life_span, double weight_in_Ounce, double height_In_Inches, boolean enemy, boolean friend) {
		
		super(name, life_span, weight_in_Ounce, height_In_Inches, enemy, friend); 
    }

	@Override
	public void health(int heart) {
		// TODO Auto-generated method stub
		if (heart > 0) {
			alive_or_not(true); 
		}
		else {
			alive_or_not(false); 
		}
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alive_or_not(boolean a) {
		// TODO Auto-generated method stub
		while (a) {
			health(life_span); 
			attack(); 
			eat(); 
			sleep(); 
			movement(); 
		}
	   System.out.println(name + " is dead");
		
	}
	
}
