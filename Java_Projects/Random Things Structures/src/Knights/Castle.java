package Knights;

public abstract class Castle {
	
	String personType; 
	int age; 
	int strength;
	boolean legalFight; 
	
	public Castle(String personType, int age, int strength, boolean legalFight) {
		this.personType = personType; 
		this.age = age; 
		this.strength = strength; 
		this.legalFight = legalFight; 
	}
	
	public abstract void fightStrategy(); 
	
	public abstract void health(); 
	
	public abstract void planStrategy();

	

	
	

}
