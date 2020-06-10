package BUGS;

public abstract class Insects {
	
	String name; 
	
	int life_span; 
	double  weight_in_Ounce; 
	double  height_in_Inches;  
	
	boolean enemy; 
	boolean friend;
 
	
	public Insects(String name, int life_span, double weight_in_Ounce, double height_in_Inches, boolean enemy, boolean friend) {
		this.name = name; 
		this.life_span = life_span; 
		this.weight_in_Ounce = weight_in_Ounce; 
		this.height_in_Inches = height_in_Inches; 
		this.enemy = enemy; 
		this.friend = friend; 
    }
	

	public abstract void health(int heart); 
	
	public abstract void attack(); 
	
	public abstract void eat(); 
	
	public abstract void sleep(); 
	
	public abstract void movement(); 
	
	public abstract void alive_or_not(boolean a); 

	
}
