package Knights;


public class BlueKnight extends Castle implements Degree {

	public BlueKnight(String personType, int age, int strength, boolean legalFight) {
		
		super(personType, age, strength, legalFight);
	}
	
	int weaponStrength = 0; 
	
	public void setWeaponStrength(int strength) {
		weaponStrength = strength; 
	}
	
	public int getWeaponStrength() {
		return weaponStrength; 
	}

	//from the Castle class
	@Override
	public void fightStrategy() {
		
		
		if (age >= 18) {
			System.out.println(personType + " can fight in the battle");
		}
		else {
			System.err.println(personType + " is illegal to fight in the battle");
		}
	

	}

	@Override
	public void health() {
	
		while (strength > 0) {
			fightStrategy(); 
			planStrategy(); 
		}
		System.err.println(personType + " is dead...");
	}

	@Override
	public void planStrategy() {
		
		int scienceResult = 0;  
		boolean mathResult; 
		
		scienceResult = scienceIdea(10, 98); 
		mathResult = mathIdea(10); 
		
		if (mathResult == false) {
			System.err.println("Warning: " + personType + " has a math problem");
		}
		if (scienceResult > 60) {
			fightStrategy(); 
		}
	
	
	}
	
	//from the interface Degree
	@Override
	public int scienceIdea(int idea1, int classStrength) {
		int pass_idea = 0; 
		int chemistry = classStrength;  
		int sum_knowledge = 0; 
		int i = 0; 
		while (i <= chemistry) {
			sum_knowledge += i; 
			if (sum_knowledge > 60) {
				pass_idea = idea1 + sum_knowledge; 
			}
			i++; 
		}
		return pass_idea; 
	}

	@Override
	public boolean mathIdea(int idea1) {
		boolean check = false; 
		int sum = 0; 
		int result = 0; 
		for (int i = 0; i <= idea1; i++) {
			sum += i; 
			if (sum % 2 == 0) {
				result = sum; 
			}
		}
		if (result > 60) {
			check = true; 
		}
		else {
			check = false; 
		}
		return check; 
	}

}
